package person;

import person.consciousness.Knowledge;

public class Student {

    private Knowledge knowledge;
    private String studentName;

    public Student(String name, Knowledge knowledge) {
        studentName = name;
        this.knowledge = knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public String getName() {
        return studentName;
    }
}
