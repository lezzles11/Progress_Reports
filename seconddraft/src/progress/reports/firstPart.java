package progress.reports;
/**
 *
 * @author lesleycheung
 */
import java.util.*; 

public class firstPart {
    private String name; 
    private List<String> goals;
    private HashMap<String, ArrayList<String>> benchmarks; 
    private int numGoals; 
    private String nameOfClass; 
    private String progressReportingPeriod; 
    private String heshe; 
    private String hisher;
    private String initials; 
    private ArrayList<String> goalAreas; 
    
    public firstPart() {
        this.name = new String(); 
        this.goals = new ArrayList<String>(); 
        this.benchmarks = new HashMap<String, ArrayList<String>>(); 
        this.numGoals = 0; 
        this.nameOfClass = new String(); 
        this.progressReportingPeriod = new String(); 
        this.hisher = new String(); 
        this.heshe = new String(); 
        this.initials = new String(); 
        this.goalAreas = new ArrayList<String>(); 
    }
    
    public void start(){
        firstPart1();
        firstPart2();
        firstPart3();
        firstPart4();
        print(); 
        getName(); 
    }
    
    public void testing() {
        testing1();
        testing2();
        testing3();
        testing4();
        testing5();
        testing6();
    }
    // getting student name 
    public void firstPart1() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Progress Reports Time!");
        System.out.println("What is this student's name?");
        this.name = reader.nextLine();
        System.out.println("To make this process easier, make sure to have " + this.name + "'s IEP goal out in a seperate window");
        System.out.println("From here on out, it is mostly copying and pasting!");
        System.out.println("And we will then generate the most beautiful progress report for you.");
    }
    // what gender? 
    public void testing1() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Whoops - I don't quite have a system in which to seperate girls from boys -");
        while (true) {
            System.out.println("Enter [1] for female, [2] for male, [3] no comment");
            System.out.println("Enter a number, please!");
            int ans = Integer.parseInt(reader.nextLine()); 
        if (ans == 1) {
            this.hisher = "her";
            this.heshe = "she";
            break; 
        } else if (ans == 2) {
            this.hisher = "his";
            this.heshe = "he";
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
    public void testing2(){
        Scanner reader = new Scanner(System.in); 
        System.out.println("What is the class that is being commented on?");
        System.out.println("Keep it short - e.g., HN English; HN World History II; Sub-Seperate Math");
        this.nameOfClass = reader.nextLine(); 
    }
    // getting progress period 
    public void testing3(){
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
    public void testing4() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("What are your initials?");
        System.out.println("Just enter 2-3 letters, please");
        System.out.println("E.g., type in LC for Lizzie Cheung");
        String initial = reader.nextLine(); 
        this.initials = "("+initial+")";
    }
    //getting the number of goals the student has 
    public void firstPart2() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("How many goals does " + this.name + " have? (Please enter a number)");
        this.numGoals = Integer.parseInt(reader.nextLine());
    }
    //getting each goal 
    public void firstPart3() {
        Scanner reader = new Scanner(System.in); 
        for (int i = 0; i < this.numGoals; i++) {
            int num = i + 1; 
            System.out.println("For goal " + num + ": ");
            System.out.print(this.name + " will be able to... ");
            System.out.println("(Finish the sentence)");
            System.out.println("E.g., write with clear organization and sufficient detail with 70% independence, as measured by teacher progress reports and curriculum based assessments.");
            String goal = reader.nextLine();
            // the first sentence of every goal 
            String finalGoal = this.name + " was able to " + goal + "."; 
            this.benchmarks.put(finalGoal, new ArrayList<String>()); 
            this.goals.add(goal); 
        }
    }
    
    // getting number of benchmarks; 
    public void firstPart4() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("\n\nNow, let's get " + this.name + "'s benchmarks!\n(Remember to have the document open!)\n\n");
        
        for (int i = 0; i < this.goals.size(); i++) {
            ArrayList<String> added = new ArrayList<String>(); 
            int num = i + 1; 
             System.out.println("How many benchmarks does " + this.name + " have for goal " + num + "?");
            System.out.println("(Just a reminder, goal " + num + " was that "  + this.name + " will be able to " + goals.get(i)+")");
            System.out.println("Remember to enter a number!");
                int numBenchmark = Integer.parseInt(reader.nextLine());
                for (int j = 0; j < numBenchmark; j++) {
                    int numba = j + 1; 
                    System.out.println("Benchmark " + numba + ":\n" + this.name + " will be able to... (finish the sentence)");
                    String benchmark = reader.nextLine();
                    System.out.println("\nWhat is an assignment or task related to this benchmark?\n");
                    System.out.println("E.g., WWII Research Paper; Geometry Final Exam; Presentation on Energy Waves (Give a specific assignment name) \n");
                    String assignment = reader.nextLine();
                    String finalBenchmark = this.name + " was able to " + benchmark + " this past semester, which was seen through the completion of " + assignment + ".";
                    added.add(finalBenchmark);
            } this.benchmarks.put(goals.get(i), added);
        }
    }
    // What kind of goal is it? 
    public void testing5(){
        Scanner reader = new Scanner(System.in); 
        String get = new String(); 
        for (int i = 0; i < this.goals.size(); i++) {
            int num = i + 1; 
            System.out.println("Is goal " + num + " an [1] organization, [2] writing, [3] reading or [4] math goal?");
            System.out.println("Enter a number, please");
            System.out.println("Remember, goal " + num + " is " + goals.get(i));
            int goalArea = Integer.parseInt(reader.nextLine()); 
            
            if (goalArea == 1) {
                get = getOrganization(); 
            } else if (goalArea == 2) {
                get = getWriting(); 
            } else if (goalArea == 3) {
                get = getReading(); 
            } else if (goalArea == 4) {
                get = getMath(); 
            } else {
                System.out.println("Sorry, please type in a number");
            }
    } this.goalAreas.add(get); 
    }
    
    public void testing6() {
        Scanner reader = new Scanner(System.in); 
        for (int i = 0; i < this.goalAreas.size(); i++) {
            System.out.println("How did " + this.name + " perform on the goal?");
            System.out.println("[1] Awesome!! [2] Okay (making progress) [3] Really made no progress / struggled in making progress");
            int num = Integer.parseInt(reader.nextLine());
            if (num == 1) {
                great(this.goalAreas.get(i));
            } else if (num == 2){
                okay(this.goalAreas.get(i));
            } else if (num ==3) {
               bad(this.goalAreas.get(i));
            } else {
                System.out.println("I don't think I understood that. Try again? ");
            }
        }
    }
    public void great(String goalArea){
        this.benchmarks.forEach((k, v) -> {
            String beginningPart = beginningPart(); 
            System.out.print(beginningPart + k + ".");
            v.forEach(w -> System.out.print(w + ","));
            System.out.println(this.name + " exceed in " + goalArea);
            System.out.println(this.name + " has been a positive influence on the class, and we are proud to see " + this.name +"'s progress over the past quarter("+ this.initials +").");
            System.out.println("");
            System.out.println();
        });
    }
    
    public void okay(String goalArea){
        this.benchmarks.forEach((k, v) -> {
            String beginningPart = beginningPart(); 
            System.out.print(beginningPart + k + ".");
            v.forEach(w -> System.out.print(w + ","));
            System.out.println(this.name + " did well in " + goalArea);
            System.out.println(this.heshe + " may need to continue to work hard on all assignments (as well as completing them on time).");
            System.out.println("Based on " + this.name + "'s current rate of progress, and with continued direct instruction and support, ");
            System.out.println(this.name + "should be able to achieve this annual goal by the end of the IEP period "+ this.initials +".");
            System.out.println();
        });
    }
    
    public void bad(String goalArea){
        this.benchmarks.forEach((k, v) -> {
            String beginningPart = beginningPart(); 
            System.out.print(beginningPart + k + ".");
            v.forEach(w -> System.out.print(this.name + "was able to " + w + ","));
            System.out.println(this.name + " struggled in " + goalArea);
            System.out.println(this.heshe + " is able to use checklists in class, but " + this.name + " may need to work on doing so independently.");
            System.out.println(this.heshe + " frequently needs encouragement in staying afterschool to complete written work.");
            System.out.print(this.name + " still requires extensive teacher-guided practice - With increased motivation and consistent effort and progress, it may be possible for " +this.name+" to achieve this goal" + this.initials + ".");
            System.out.println();
        });
    }
    
    public void print(){
        this.benchmarks.forEach((k, v) -> {
            System.out.print(k + " = ");
            v.forEach(w -> System.out.print(w + ","));
            System.out.println();
        });
    }
    
    public String getName() {
        return this.name; 
    }
    
    public String getOrganization() {
        String organization = " utilizing an organizational system in checking with " + this.hisher + " teachers";
        return organization; 
    }
    
    public String getReading() {
        String reading = " reading to identify the main idea of various passages.";
        return reading; 
    }
    
    public String getWriting(){
        String writing = "writing a cohesive multi-paragraph writing piece.";
        return writing; 
    }
    
    public String getMath() {
        String math = " solving complex word problems by breaking each step down."; 
        return math; 
    }
    public String beginningPart(){
        String pt1 = this.progressReportingPeriod + "\n";
        String pt2 = "In " + this.nameOfClass + ", " + this.name + " is making progress towards the goal of "; 
        String finally1 = new String(); 
        finally1 = pt1 + pt2; 
        return finally1; 
    }
    
    
    
}


