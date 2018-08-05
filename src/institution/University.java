package institution;

import institution.interlink.Internship;
import person.Student;

import java.util.ArrayList;

public class University {

    private String name;
    private ArrayList<Student> studentsList = new ArrayList<>();
    private Internship internship;


    public University (String name) {
        this.name = name;
    }

    public void addInternship (Internship internship) {
        this.internship = internship;
    }

//    public void setStudent(Student student) {
//
//    }

    public void addStudent (Student student) {
        studentsList.add(student);
    }

    private float getAverageKnowledgeLevel () {
        int sum = 0;
        for (Student student : studentsList) {
            sum += student.getKnowledge().getLevel();
        }
        return (float) sum / studentsList.size();
    }

    public ArrayList<Student> getStudentsForInternship () {
        for(Student student: studentsList) {
            if (student.getKnowledge().getLevel() > getAverageKnowledgeLevel()) {
                internship.setStudent(student);
            }
        }
        return internship.getStudents();
    }
}
