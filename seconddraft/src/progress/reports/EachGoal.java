/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progress.reports;
import java.util.*; 
/**
 *
 * @author lesleycheung
 */
public class EachGoal {
    private int numBenchmarks; 
    private ArrayList<String> benchmarks; 
    private String name; 
    private String assignment; 
    private int progress; 
    private int goalArea; 
    private String goalType; 
    
    public EachGoal(String name) {
        this.assignment = new String();
        this.name = name; 
        this.numBenchmarks = 0; 
        this.benchmarks = new ArrayList<String>(); 
        this.progress = 0; 
        this.goalArea = 0; 
        this.goalType = new String(); 
    }
    public void start() {
        addGoalNum(); 
        addAssignment(); 
        addNumBenchmarks(); 
        addGoalArea(); 
        addBenchmarks(); 
        getBenchmarks(); 
    }
     public void addGoalNum(){
        Scanner reader = new Scanner(System.in); 
        System.out.println("Is this goal an [1] organization, [2] writing, [3] reading or [4] math goal?");
        System.out.println("Enter a number, please");
        this.goalArea = Integer.parseInt(reader.nextLine()); 
     } 
     //getting assignment
    public void addAssignment(){
        Scanner reader = new Scanner(System.in); 
        System.out.println("\nGive me an assignment that is related to this goal.");
        System.out.println("E.g., WWII Research Paper, Geometry Final Exam, Bi-Monthly Binder Checks, Lord of the Flies Packet");
        //String cleaner 
        this.assignment = reader.nextLine(); 
    }
    // Getting the number of benchmarks 
    public void addNumBenchmarks() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("\nHow many benchmarks does this goal have?");
        this.numBenchmarks = Integer.parseInt(reader.nextLine());
    }
     //getting goal area
     private void addGoalArea(){ 
         SpecificGoals type = new SpecificGoals(); 
         SpecificGoals type2 = new SpecificGoals(); 
         String input = new String(); 
         String input2 = new String(); 
            if (goalArea == 2) {
                input = type.getWrite();
            } else if (goalArea == 3) {
                input = type.getRead();
            } else if (goalArea == 4) {
                input = type.getMath();
            } else {
                input = type.getOrg();
            }
            this.goalType = "Overall, " + this.name + " has made consistent progress in" + input + "\n";
     }
    // getting each benchmark and adding that to an arraylist 
    public void addBenchmarks() {
        Scanner reader = new Scanner(System.in); 
        for (int i = 0; i < this.numBenchmarks; i++) {
            int num = i + 1; 
            System.out.println("\nBenchmark " + num + ":\n" + this.name + " is making progress towards the goal of...(begin with a verb that ends with -ing)");
            System.out.println("E.g., drafting and organizing ideas before putting them down on paper.");
            String benchmark = reader.nextLine();
            String total = " " + benchmark; 
            this.benchmarks.add(total);
        }
    }
    
    //printing each benchmark 
    public void getBenchmarks() {
        String returned = new String();
        String each = new String(); 
        for (int i = 1; i < this.benchmarks.size(); i++) {
            SpecificGoals comment = new SpecificGoals();
            if (this.progress == 2) {
                each = comment.getTransition() + this.name + comment.getOkay() + this.benchmarks.get(i) + ".\n"; 
            } else if (this.progress == 3) {
                each = comment.getTransition() + this.name + comment.getToImprove() + this.benchmarks.get(i) + ".\n";
            } else {
                each = comment.getTransition() + this.name + comment.getAwesome() + this.benchmarks.get(i) + ".\n";
            }
            returned += each; 
        } 
        System.out.println(getAssignment() + returned + this.goalType);
    }
    private String getAssignment(){
        String finally1 = "This past quarter, " + this.name + " made progress in" + this.benchmarks.get(0) + ", as demonstrated by " + this.assignment + ".";
        return finally1; 
    }
    
   
    
    
        

    
}
