/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progress.reports;

/**
 *
 * @author lesleycheung
 */
public class ProgressReports {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        firstPart first = new firstPart(); 
        first.start();
        secondPart second = new secondPart(first.getName(), first.getHashMap()); 
        
    }
    
}
