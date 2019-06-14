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
public class SpecificGoals {
    private static final String[] AWESOME = {"'s been able to successfully identify steps in ",
    " has made awesome progress in ",
    " always manages to have a positive influence on the class environment by ",
    " has improved his skills in "
    };
    private static final String[] BAD = { " may need more encouragement in", 
    " may need to demonstrate more consistent effort in", 
    " also had difficulty in ",
    " also needed more direct instruction in ",
    " struggled with independently ",
    " needs frequent reminders in ",
    "'s inconsistent attendance over the past quarter may have impeded the ability in "
    };
    
    private static final String[] OKAY = {" also requires some teacher support and check-ins in",
                    "'s distractions in class may sometimes affect the process of",
                    " seemed to have little difficulty in ",
                    " has been making consistent progress in "
    };
    private static final String[] READ = {
    " using active reading strategies to try to make sense of texts.",
    " taking notes on several sources for a research paper.",
    " reading and annotating each source, finding evidence from each text.",
    " using context clues and other active reading strategies in order to identify complex vocabulary and determine the key concepts of a passage."
    };
    private static final String[] MATH = {
    " analyzing various sets of data displays within MCAS practice.",
    " identifying key information to set up and solve multi-step problems.",
    " exploring the mathematical reasoning necessary for planning and applying these mathematical principles.",
    " analyzing and representing given data graphically as well as numerically."
    };
    private static final String [] WRITE = {
    " editing and revising the written work.",
    " organizing multi-paragraph compositions.",
    " analyzing the evidence as well as connecting it back to the thesis.",
    " composing longer writing assignments independently.",
    " creating a clear and concise thesis statement.",
    " struggled to write analysis or use inferential material for evidence."
    }; 
    private static final String[] ORG = {
    " completing assigned assignments.", 
    " staying after school and completing work on time.",
    " implementing and following through with these organizational systems.",
    " impacting the ability to retain the content learned in class.",
    " completing assigned assignments.",
    " completing larger projects."
    };
    private final String awesome; 
    private final String okay; 
    private final String bad; 
    private final String organization; 
    private final String reading; 
    private final String math; 
    private final String writing; 
    private final Random random = new Random(); 
    
    public SpecificGoals() {
        this.awesome = AWESOME[random.nextInt(AWESOME.length)];
        this.okay = OKAY[random.nextInt(OKAY.length)];
        this.bad = BAD[random.nextInt(BAD.length)];
        this.organization = ORG[random.nextInt(ORG.length)];
        this.reading = READ[random.nextInt(READ.length)];
        this.math = MATH[random.nextInt(MATH.length)];
        this.writing = WRITE[random.nextInt(WRITE.length)];
    }
    
    public String getBad(){
        return this.bad; 
    }
    public String getAwesome() {
        return this.awesome; 
    } 
    public String getOkay(){
        return this.okay;
    } 
    public String getOrg() {
        return this.organization; 
    } 
    public String getRead() {
        return this.reading; 
    }
    public String getWrite(){
        return this.writing;
    } 
    public String getMath(){
        return this.math; 
    }
}