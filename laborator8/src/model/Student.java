package model;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String nume;
    int nota;

    public Student(int id, String nume, int nota) {
        this.id = id;
        this.nume = nume;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", nota=" + nota +
                '}';
    }
}
