/**
 * @(#)Salary.java
 *
 *
 * @author 
 * @version 1.00 2018/9/13
 */
import java.util.*;
public class Salary {
        
    /**
     * Creates a new instance of <code>Salary</code>.
     */
    public Salary() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int HoursOfWork = 0; 
        double TotalSalary = 0;
        
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Please enter Hours of Work:");
        HoursOfWork = sc.nextInt();
       TotalSalary = HoursOfWork * 4.70 ;
       System.out.print("Total Salary :"+TotalSalary);
    }
}
