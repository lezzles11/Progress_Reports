package progress.reports;
/**
 *
 * @author lesleycheung
 */
import java.util.*; 
/*
*The program here is still in progress (which is why it's quite messy right now). 

The purpose of this program is to generate progress reports that address students with disabilities' 
reading, writing, organizational and math goals. 
In the US, special educators are required to comment on students' progress (goals and benchmarks) four times a year.
The goal of this program is to lighten the workload of special educators around the states. 
*/

public class firstPart {
    private String name; 
    private List<String> goals; 
    private int numGoals; 
    private String nameOfClass; 
    private String progressReportingPeriod; 
    private String heshe; 
    private String hisher;
    private String initials; 
    private String cheshe; 
    
    public firstPart() {
        this.name = new String(); 
        this.numGoals = 0; 
        this.nameOfClass = new String(); 
        this.progressReportingPeriod = new String(); 
        this.hisher = new String(); 
        this.heshe = new String(); 
        this.initials = new String(); 
        this.cheshe = new String(); 
    }
    public void firstPart(){
        step1Name();
        step2Gender(); 
        step3Class();
        step4Period(); 
        step5Initials();
    }
    public void secondPart(){
            step1NumGoals();
            step2AddGoals();
        }
    // getting student name 
    public void step1Name() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Progress Reports Time!");
        System.out.println("What is this student's name?");
        this.name = reader.nextLine();
        System.out.println("To make this process easier, make sure to have " + this.name + "'s IEP goal out in a seperate window");
        System.out.println("From here on out, it is mostly copying and pasting!");
        System.out.println("And we will then generate the most beautiful progress report for you.");
    }
    // what gender? 
    public void step2Gender() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("\nWhoops - I don't quite have a system in which to seperate girls from boys -");
        while (true) {
            System.out.println("Enter [1] for female, [2] for male, [3] no comment");
            System.out.println("Enter a number, please!");
            int ans = Integer.parseInt(reader.nextLine()); 
            if (ans == 1) {
            this.hisher = "her";
            this.heshe = "she";
            this.cheshe = "She";
            break; 
            } else if (ans == 2) {
            this.hisher = "his";
            this.heshe = "he";
            this.cheshe = "He";
            break; 
        } else if (ans == 3) {
            this.hisher = this.name; 
            this.heshe = this.name; 
            break; 
        } else {
            System.out.println("Please enter a number!");
        }
        }
    }
    // getting the name of the class 
    public void step3Class(){
        Scanner reader = new Scanner(System.in); 
        System.out.println("What is the class that is being commented on?");
        System.out.println("Keep it short - e.g., HN English; HN World History II; Sub-Seperate Math");
        this.nameOfClass = reader.nextLine(); 
    }
    // getting progress period 
    public void step4Period(){
        Scanner reader = new Scanner(System.in); 
        System.out.println("What is the progress reporting period?");
        System.out.println("Input a number between 1 and 4");
        int period = Integer.parseInt(reader.nextLine());
        if (period == 1) {
            this.progressReportingPeriod = "Progress Reporting Period #1 " + this.initials +":";
        } else if (period == 2) {
            this.progressReportingPeriod = "Progress Reporting Period #2 " + this.initials+":";
        } else if (period == 3) {
            this.progressReportingPeriod = "Progress Reporting Period #3 " + this.initials+":";
        } else if (period == 4) {
            this.progressReportingPeriod = "Progress Reporting Period #4 " + this.initials+":";
        } else {
            System.out.println("Please enter a number between 1 and 4");
        }
    };
    // getting initials of special educator 
    public void step5Initials() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("What are your initials?");
        System.out.println("Just enter 2-3 letters, please");
        System.out.println("E.g., type in LC for Lizzie Cheung");
        String initial = reader.nextLine(); 
        this.initials = "("+initial+")";
    }
    
    //getting the number of goals the student has 
    public void step1NumGoals() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("How many goals does " + this.name + " have? (Please enter a number)");
        this.numGoals = Integer.parseInt(reader.nextLine());
    }
    //getting each goal 
    public void step2AddGoals() {
        Scanner reader = new Scanner(System.in); 
        for (int i = 0; i < this.numGoals; i++) {
            int num = i + 1; 
            System.out.println("For goal " + num + ": ");
            System.out.print(this.name + " is making progress towards the goal of... (begin with verb that ends with -ing)");
            System.out.println("E.g., writing with clear organization and sufficient detail with 70% independence, as measured by teacher progress reports and curriculum based assessments.");
            String goal = reader.nextLine();
            // the first sentence of every goal 
            String finalGoal = goal + ".\n"; 
            this.goals.add(finalGoal); 
        }
    }
    // What kind of goal is it? 
   
    // getting a number and then printing out the stuff as a result (Goals) 
    public int getNumber() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("How did " + this.name + " perform on this goal?"); 
        System.out.println("[1] Awesome!! [2] Okay (making progress) [3] Really made no progress / struggled in making progress");
        int num = Integer.parseInt(reader.nextLine());
        return num; 
   } 
        
            /*
    
    public void print(){
        this.benchmarks.forEach((k, v) -> {
            System.out.print(k + " = ");
            v.forEach(w -> System.out.print(w + ","));
            System.out.println();
        });
    }
    */
    
    public String getName() {
        return this.name; 
    }
    
    
    
}


