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
    private ArrayList<String> goals; 
    private int numGoals; 
    private String nameOfClass; 
    private String progressReportingPeriod; 
    private String heshe; 
    private String hisher;
    private String initials; 
    private String cheshe; 
    private ArrayList<Integer>progress; 
    private EachGoal testing; 
    
    public firstPart() {
        this.name = new String(); 
        this.numGoals = 0; 
        this.nameOfClass = new String(); 
        this.progressReportingPeriod = new String(); 
        this.hisher = new String(); 
        this.heshe = new String(); 
        this.initials = new String(); 
        this.cheshe = new String(); 
        this.progress = new ArrayList<Integer>(); 
        this.goals = new ArrayList<String>(); 
    }
    public void start() {
        addName(); 
        addClass(); 
        addPeriod(); 
        addInitials(); 
        addNumGoals(); 
        addGoals(); 
        printing(); 
        
    }
    // getting student name 
    public void addName() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Progress Reports Time!");
        System.out.println("What is this student's name?");
        this.name = reader.nextLine();
        System.out.println("To make this process easier, make sure to have " + this.name + "'s IEP goal out in a seperate window");
        System.out.println("From here on out, it is mostly copying and pasting!");
        System.out.println("And we will then generate the most beautiful progress report for you.");
    }
    // getting the name of the class 
    public void addClass(){
        Scanner reader = new Scanner(System.in); 
        System.out.println("What is the class that is being commented on?");
        System.out.println("Keep it short - e.g., HN English; HN World History II; Sub-Seperate Math");
        this.nameOfClass = reader.nextLine(); 
    }
    // getting progress period 
    public void addPeriod(){
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
    public void addInitials() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("What are your initials?");
        System.out.println("Just enter 2-3 letters, please");
        System.out.println("E.g., type in LC for Lizzie Cheung");
        String initial = reader.nextLine(); 
        this.initials = "("+initial+")";
    }
   
    //getting the number of goals the student has 
    public void addNumGoals() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("How many goals does " + this.name + " have? (Please enter a number)");
        this.numGoals = Integer.parseInt(reader.nextLine());
    }
    //getting each goal 
    public void addGoals() {
        Scanner reader = new Scanner(System.in); 
        for (int i = 0; i < this.numGoals; i++) {
            int num = i + 1; 
            System.out.println("For goal " + num + ": ");
            System.out.print(this.name + " is making progress towards the goal of... \n(Begin with verb that ends with -ing)");
            System.out.println("\nE.g., writing with clear organization and sufficient detail with 70% independence, as measured by teacher progress reports and curriculum based assessments.");
            String goal = reader.nextLine();
            // the first sentence of every goal 
            String finalGoal = this.name + " has been making consistent progress towards " + goal + "."; 
            this.goals.add(finalGoal); 
        }
    }
    public void printing() {
        for (int i = 0; i < numGoals; i++) {
            int nums = i + 1; 
            EachGoal test = new EachGoal(this.name); 
            System.out.println("Now, let's do goal " + nums + "!\n");
            test.start(); 
            System.out.print("\n" + this.progressReportingPeriod + "\n" + "In " + this.nameOfClass + ", " +this.goals.get(i));
            test.print();
            System.out.println(this.initials);
        }
    }
    public String getName() {
        return this.name; 
    }
    public String getProgress(){
        return this.progressReportingPeriod;
    }
    public String getNameOfClass(){
        return this.nameOfClass;
    }
    public String getInitials(){
        return this.initials;
    }
    
            /*
    
    public void print(){
        this.benchmarks.forEach((k, v) -> {
            System.out.print(k + " = ");
            v.forEach(w -> System.out.print(w + ","));
            System.out.println();
        });
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
    */
    
    
}


