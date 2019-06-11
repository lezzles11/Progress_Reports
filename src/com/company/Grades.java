package com.company;

import java.util.*;
public class Grades {
    private Map<String, String> grades;

    public Grades() {
        this.grades = new HashMap<String, String>();
    }

    public void grades() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Number of classes: ");
        int numClasses = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <= numClasses; i++) {
            System.out.println("Write in name of class " + i);
            String coreClass = reader.nextLine();
            System.out.println("Number grade: " +
                    "\n A = 100, A- = 90, B+ = 87, B = 83, B- = 80, C+ = 79, C = 73, C- = 70" +
                    "\n D+ = 69, D = 63, D- = 60, F = 59");
            String grade = reader.nextLine();
            grades.put(coreClass, grade);
            // TO DO: sort grades by value (integer)
        }
    }


}










