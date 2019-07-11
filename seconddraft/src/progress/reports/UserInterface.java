/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progress.reports;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.*; 
import java.awt.*; 
/**
 *
 * @author lesleycheung
 */
public class UserInterface implements Runnable {
    private JFrame frame; 
    public UserInterface() {
    }

@Override
public void run() {
    frame = new JFrame("ProgressReports");
    frame.setPreferredSize(new Dimension(200, 200));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    createComponents(frame.getContentPane());
    frame.pack();
    frame.setVisible(true); 
} 

public void createComponents(Container container) {
    GridLayout layout = new GridLayout(10, 2); 
    container.setLayout(layout); 
    
    /* Name of Student */
    JLabel textName = new JLabel("Student Name: ");
    JTextField nameField = new JTextField();
    container.add(textName); 
    container.add(nameField); 
    
    /* Class  */
    JLabel textClass = new JLabel("Class: ");
    JTextField classField = new JTextField();
    container.add(textClass); 
    container.add(classField); 
    
    /* Initials  */
    JLabel textInitials = new JLabel("Your Initials: ");
    JTextField initialsField = new JTextField();
    container.add(textInitials); 
    container.add(initialsField); 
    
    
    /* Progress Reporting Period */
    container.add(new JLabel("Choose Progress Reporting Period"));
    JRadioButton firstPeriod = new JRadioButton("1st Progress Reporting Period");
    JRadioButton secondPeriod = new JRadioButton("2nd Progress Reporting Period");
    JRadioButton thirdPeriod = new JRadioButton("3rd Progress Reporting Period");
    JRadioButton fourthPeriod = new JRadioButton("4th Progress Reporting Period");
    ButtonGroup progressPeriod = new ButtonGroup();
    
    progressPeriod.add(firstPeriod);
    progressPeriod.add(secondPeriod); 
    progressPeriod.add(thirdPeriod);
    progressPeriod.add(fourthPeriod);
    container.add(firstPeriod);
    container.add(secondPeriod);
    container.add(thirdPeriod);
    container.add(fourthPeriod);
    
    // getting number of goals 
    
    // getting goals 
    
    //getting goal area
    
    
    //getting assignment
    
    //getting number of benchmarks
    
    
    //getting each benchmark 
    
    
    JButton submitButton = new JButton("Submit");
    
    
}

/* public JFrame getFrame() {
    
} */ 
}
