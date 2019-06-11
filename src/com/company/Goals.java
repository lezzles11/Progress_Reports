package com.company;
import java.util.*;
public class Goals {
    private List<String> goals;
    private String name;
    private int numGoals;

    public Goals(String name) {
        this.name = name;
        this.goals = new ArrayList<String>();
        this.numGoals = 0;
    }
    public Goals() {
        this.name = new String();
        this.goals = new ArrayList<String>();
        this.numGoals = 0;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNumGoals() {
        return this.numGoals;
    }
    public void setNumGoals() {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many IEP goals does " + this.name + " have?");
        this.numGoals = Integer.parseInt(reader.nextLine());
    }
    public void setGoal() {
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < numGoals; i++) {
            int num = i + 1;
            System.out.println(num + ". What is " + this.name + "'s IEP goal?");
            System.out.println("Goal " + num + ": " + this.name + " will be able to... (finish the sentence)");
            String goal = reader.nextLine();
            this.goals.add(goal);
        }
    }
    public void getGoal(){
        for (String each : this.goals) {
            System.out.println(each);
        }
    }




}
