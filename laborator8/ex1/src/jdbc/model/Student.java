package jdbc.model;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String mark;

    public Student(int id, String firstName, String lastName, String mark) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public Student(String firstName, String lastName, String mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
