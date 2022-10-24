/**
 * @(#)CandyBar.java
 *
 *
 * @author 
 * @version 1.00 2018/9/13
 */
import java.util.*;
public class CandyBar {
        
    /**
     * Creates a new instance of <code>CandyBar</code>.
     */
    public CandyBar() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double NumberOfCandyBar = 0 ;
        double NetProfit = 0 ;
        double EarlyProfit = 0;
        	
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Please enter Number of Candy Bar:");
         NumberOfCandyBar = sc.nextDouble();
        EarlyProfit = NumberOfCandyBar * 0.75;
        NetProfit = EarlyProfit * 0.90;
       System.out.print("Net profit:"+NetProfit);
    }
}
