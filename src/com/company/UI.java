package com.company;

import java.util.*;
public class UI {
    private Goals goals;
    private String name;
    private int numGoals;

    public UI() {
        this.name = new String();
        this.numGoals = 0;
        this.goals = new Goals(name);
    }

    public void start() {
        setName();
        this.goals.setName(this.name);
    }

    public void setName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Progress Report: Individualized Education Plan");
        System.out.println("Progress Reporting Period 3");
        System.out.print("Type in student's name: ");
        this.name = reader.nextLine();
    }



}










