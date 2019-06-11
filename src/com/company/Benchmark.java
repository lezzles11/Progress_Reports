package com.company;
import java.util.*;
public class Benchmark {
    private int num;
    private String name;
    private List<String> benchmarks;
    private String getBenchmark;
    private Goals goals;

    public Benchmark(String name) {
        this.name = name;
        this.goals = new Goals(name);
        this.num = 0;
        this.benchmarks = new ArrayList<String>();
    }
    public void setBenchmarks() {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many benchmarks does this goal have?");
        this.num = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <= this.num; i++) {
            System.out.println("Enter benchmark " + i + ":");
            System.out.println(this.name + " will be able to... \n (finish the sentence)");
            String ableTo = reader.nextLine();
            this.benchmarks.add(ableTo);
        }
    }
    public void printGoalAndBenchmark() {
        this.goals.getNumGoals();
        for (int i = 1; i <= this.goals.getNumGoals(); i++) {
            this.goals.setGoal();
            this.goals.getGoal();
            getBenchmarks();
        }
    }
    public void getBenchmarks() {
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < this.benchmarks.size(); i++) {
            int num = i + 1;
            System.out.print("Benchmark " + num + ": Did " + this.name + " do [1] Extremely Well [2] Okay [3] Poorly on " + benchmarks.get(i) + "?");
            int assess = Integer.parseInt(reader.nextLine());
            Assignments one = new Assignments(this.name);
            one.setAssignment();
            if (assess == 1) {
                String awesome = this.name + " was able to " + benchmarks.get(i) + " this past quarter." +
                        this.name + " did particularly well in " + one.getAssignmentClass() + " , scoring a " +
                        one.getGrade() + " on the " + one.getAssignmentName() + " assignment.";
                System.out.print(awesome);
            } else if (assess == 2) {
                String okay = this.name + " was able to " + benchmarks.get(i) + " this past quarter." +
                        this.name + " did well in " + one.getAssignmentClass() + " , scoring a " +
                        one.getGrade() + " on the " + one.getAssignmentName() + " assignment. However, " + this.name +
                        " needed a lot of additional support in " + benchmarks.get(i);
                System.out.print(okay);
            } else if (assess == 3) {
                String poorly = this.name + " struggled in " + benchmarks.get(i) + " this past quarter." +
                        this.name + " needed help in " + one.getAssignmentClass() + ", scoring a " +
                        one.getGrade() + " on the " + one.getAssignmentName() + " assignment. However, " + this.name +
                        " demonstrates some initiative in making the missing work up. " + this.name +
                        " may not be able to " + benchmarks.get(i) + ", but may need to put in additional effort and initiative in doing so.";
                System.out.print(poorly);
            } else {
                System.out.println("Sorry, I did not understand that command");
            }
        }
    }


}
