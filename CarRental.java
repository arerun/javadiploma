awdsdw**
 * @(#)CarRental.java
 *
 *
 * @author : Azran
 * @ Lab 1 : Calculate miles driven and total charge
 *         Input : Beginning odometer , Ending odometer , Number of days
 *         Process : Miles driven = Ending odometer - Beginning odometer
 *                   Total charge = RM 15 *(Number of days ) + RM 0.12 *(Miles driven )
 *         Output : Miles driver , Total Charge
 * @version 1.00 2018/8/30
 */
import java.util.*;
public class CarRental {
        
    /**
     * Creates a new instance of <code>CarRental</code>.
     */
    public CarRental() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable declaration 
         int BeginningOdometer = 0;
         int EndingOdometer = 0;
         int NumberOfDays = 0;
         int MilesDriven = 0;
         double TotalCharge = 0;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.print(" Enter Beginning Odometer :");
         	BeginningOdometer = sc.nextInt ();
         System.out.print(" Enter Ending Odometer :");
         	EndingOdometer = sc.nextInt ();
         System.out.print(" Enter Number of Days :");
         	NumberOfDays = sc.nextInt ();
         MilesDriven = EndingOdometer - BeginningOdometer;
         TotalCharge = 15 * NumberOfDays + 0.12 * MilesDriven;
         System.out.print(" Miles driven :"+MilesDriven+"KM");
         System.out.print("\n Total Charges :RM"+TotalCharge);       
    }
}
