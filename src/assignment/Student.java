package assignment;

import java.util.List;

public class Student {
    String name;
    List<Assessment> assessments;

    public Student(String name, List<Assessment> assessments) {
        this.name = name;
        this.assessments = assessments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }
}
