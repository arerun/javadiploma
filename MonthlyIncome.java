/**
 * @(#)MonthlyIncome.java
 *
 *
 * @author 
 * @version 1.00 2018/9/20
 */
import java.util.*;
public class MonthlyIncome {
        
    /**
     * Creates a new instance of <code>MonthlyIncome</code>.
     */
    public MonthlyIncome() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rate = 0 ; 
        int day =0 ;
        int hour = 0 ;
        double grossPay = 0;
        double netPay = 0 ;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter rate:");
         rate = sc.nextInt ();
        System.out.print("Please enter day :");
         day = sc.nextInt ();
        System.out.print ("Please enter hour:"); 
         hour = sc.nextInt ();
        grossPay = rate * day * hour ;
        
        if (grossPay>0 && grossPay<=300)	 	
        {
        	netPay = grossPay - (grossPay * 0.1);
        }
        else if (grossPay >=300.01 && grossPay <=400)
        {
        	netPay = grossPay - (grossPay * 0.12);
        }
        else if (grossPay >=400.01 && grossPay <=500)
        {
        	netPay = grossPay - (grossPay * 0.15);
        }
        else if (grossPay >=500.01)
        {
        	netPayt = grossPay -(grossPay * 0.20);
        }
        
        System.out.print ("Netpay : RM"+netPay);
    }
}
