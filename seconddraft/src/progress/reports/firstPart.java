package progress.reports;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lesleycheung
 */
import java.util.*; 

public class firstPart {
    private String name; 
    private List<String> goals; 
    public firstPart() {
        this.name = new String(); 
        this.goals = new ArrayList<String>(); 
    }
    
    public void firstPart1() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Progress Reports Time!");
        System.out.println("What is this student's name?");
        this.name = reader.nextLine();
    }
    
    
    public void firstPart2() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("How many goals does " + this.name + " have?");
        int numGoals = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < numGoals; i++) {
            int num = i + 1; 
            System.out.println("For goal " + num + ": ");
            System.out.print(this.name + " will be able to... ");
            System.out.println("(Finish the sentence)");
            String goal = reader.nextLine(); 
            this.goals.add(goal); 
        }
       
    }
    
}


