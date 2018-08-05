package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("1", new Knowledge(4)));
        university.addStudent(new Student("2", new Knowledge(12)));
        university.addStudent(new Student("3", new Knowledge(10)));
        university.addStudent(new Student("4", new Knowledge(4)));
        university.addStudent(new Student("5",new Knowledge(7)));

        Internship internship = new Internship("Interlink");

        university.addInternship(internship);

        System.out.println("List of internship's students:");
        for(Student student: university.getStudentsForInternship()) {
            System.out.println(student.getName());
        }
    }
}
