package com.company;
import java.util.*;
public class Assignments {
    private String grade;
    private String class1;
    private String assignmentName;
    private String name;
    public Assignments (String name) {
        this.name = name;
        this.grade = new String();
        this.class1 = new String();
        this.assignmentName = new String();
    }
    public void setAssignment() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> assignments = new ArrayList<String>();
        System.out.println("What is the name of an assignment (related to this benchmark)?");
        this.assignmentName = reader.nextLine();
        System.out.println(this.name + "'s assignment score: ");
        this.grade = reader.nextLine();
        System.out.println("What class was this?");
        this.class1 = reader.nextLine();
    }
    public String getAssignmentName() {
        return this.assignmentName;
    }
    public String getAssignmentClass() {
        return this.class1;
    }
    public String getGrade() {
        return this.grade;
    }
}
