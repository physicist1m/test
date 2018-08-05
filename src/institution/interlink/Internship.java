package institution.interlink;

import person.Student;

import java.util.ArrayList;

public class Internship {

    private String name;
    private ArrayList<Student> studentsList = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        studentsList.add(student);
    }

    public ArrayList<Student> getStudents() {
        return studentsList;
    }
}
