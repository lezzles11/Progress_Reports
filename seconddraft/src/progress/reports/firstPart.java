package progress.reports;
/**
 *
 * @author lesleycheung
 */
import java.util.*; 

public class firstPart {
    private String name; 
    private List<String> goals;
    private Map<String, ArrayList<String>> benchmarks; 
    private int numGoals; 
    
    public firstPart() {
        this.name = new String(); 
        this.goals = new ArrayList<String>(); 
        this.benchmarks = new HashMap<String, ArrayList<String>>(); 
        this.numGoals = 0; 
    }
    // getting student name 
    public void firstPart1() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Progress Reports Time!");
        System.out.println("What is this student's name?");
        this.name = reader.nextLine();
    }
    //getting the number of goals the student has 
    public void firstPart2() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("How many goals does " + this.name + " have?");
        System.out.println("Remember to enter a number!");
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
        System.out.println("\n\n\nNow, let's get " + this.name + "'s benchmarks! \n(Remember to have the document open!)");
        ArrayList<String> added = new ArrayList<String>(); 
        for (int i = 0; i < this.benchmarks.size(); i++) {
            int num = i + 1; 
            System.out.println("(Just a reminder, goal " + num + " was that "  + this.name + " will be able to " + goals.get(i)+")");
            System.out.println("Remember to enter a number!");
                int numBenchmark = Integer.parseInt(reader.nextLine());
                for (int j = 0; j < numBenchmark; j++) {
                    int numba = j + 1; 
                    System.out.println("Write down benchmark " + numba);
                    System.out.println(this.name + " will be able to... (finish the sentence)");
                    String benchmark = reader.nextLine();   
                    added.add(benchmark);
            } this.benchmarks.put(goals.get(i), added);
        }
    }
    
    // printing out all goals
    public void firstPart5(){
        this.benchmarks.forEach((k, v) -> {
            System.out.print(k + " = ");
            v.forEach(w -> System.out.print(w + ","));
            System.out.println();
        });
    }
    // now that we have all this information, let's start typing it out. 
    // How did the student really do? 
 
    /*public void firstPart4() {
        System.out.println("Now, let's get started with talking about how " + this.name + " really did.");
        for (int i = 0; i < this.benchmarks.size(); i++) {
            System.out.println("How did " + this.name + " do on ");
    }
    }
    
    public void firstPart5(){
        this.benchmarks.forEach((k, v) -> {
            System.out.print(k + " = ");
            v.forEach(w -> System.out.print(w + ","));
            System.out.println();
        });
    }
 */   
}


