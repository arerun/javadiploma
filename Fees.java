
/**
 * @(#)Fees.java
 *
 *
 * @author 
 * @version 1.00 2018/9/13
 */
import java.util.*;
public class Fees {
        
    /**
     * Creates a new instance of <code>Fees</code>.
     */
    public Fees() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double books = 0;
        double creditHour = 0;
        double StudentTotalFees = 0 ;
        
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Please enter amount of books:");
        books = sc.nextDouble();
       System.out.print("Please enter amount of Credit Hour:");
        creditHour = sc.nextDouble();
       StudentTotalFees = (250*creditHour) + books + 65;
       System.out.print("Student Total Fees :"+StudentTotalFees) ;	
    }
}
