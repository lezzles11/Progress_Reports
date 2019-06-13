package progress.reports;
/**
 *
 * @author lesleycheung
 */
import java.util.*; 

public class firstPart {
    private String name; 
    private List<String> goals;
    private int goalNum; 
    private Map<String, ArrayList<String>> benchmarks; 
    private List<String> listBenchmark; 
    public firstPart() {
        this.name = new String(); 
        this.goals = new ArrayList<String>(); 
        this.goalNum = 0; 
        this.benchmarks = new HashMap<String, ArrayList<String>>();
        this.listBenchmark = new ArrayList(); 
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
            this.goalNum++; 
            int num = i + 1; 
            System.out.println("For goal " + num + ": ");
            System.out.print(this.name + " will be able to... ");
            System.out.println("(Finish the sentence)");
            String goal = reader.nextLine(); 
            this.benchmarks.put(goal, new ArrayList<String>()); 
            this.goals.add(goal); 
        }
    }
    public void firstPart3() {
        Scanner reader = new Scanner(System.in); 
        for (int i = 0; i < this.goals.size(); i++) {
            int num = i +1; 
            System.out.println("How many benchmarks does goal " + num + " have?");
            System.out.println("(Just a reminder, goal " + num + " was that "  + this.name + " will be able to " + goals.get(i));
            int numBenchmark = Integer.parseInt(reader.nextLine());
            for (int j = 0; j < numBenchmark; j++) {
                ArrayList <String> added = new ArrayList<String>(); 
                int nums = j + 1; 
                System.out.println("Write down benchmark " + nums);
                System.out.println(this.name + "will be able to... (finish the sentence)");
                String benchmark = reader.nextLine();   
                added.add(benchmark);
                this.benchmarks.put(goals.get(i), added);
            } 
        }
    }
    
    public void firstPart4() {
        for (String goal : this.benchmarks.keySet()) {
            System.out.println(goal + this.benchmarks.get(goal));
        }
    
    }
}


