package jdbc.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/pao";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "root";

    private static final String RETRIEVE_STUDENTS = "SELECT * FROM student";
    private static final String CREATE_NEW_STUDENT = "INSERT INTO student(id, firstName, lastName, mark) " +
            "values (NULL, ?, ?, ?)";
    private static final String DELETE_STUDENT =  "DELETE from student where id = ?";

    public static Connection getDbConnection() throws SQLException{
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
    }

    public boolean addStudent(Student student) throws  SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(CREATE_NEW_STUDENT);
        preparedStatement.setString(1, student.getFirstName());
        preparedStatement.setString(2, student.getLastName());
        preparedStatement.setString(3, student.getMark());

        return preparedStatement.executeUpdate() > 0;
    }

    public List<Student> retrieveStudents() throws SQLException {
        List<Student> result  = new ArrayList<>();
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(RETRIEVE_STUDENTS);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            Student student = new Student(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4));

            result.add(student);
        }
        return result;
    }

    public boolean deleteStudent(int id) throws SQLException{
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(DELETE_STUDENT);
        preparedStatement.setInt(1,id);
        return preparedStatement.executeUpdate() > 0;
    }
}
