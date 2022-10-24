/**
 * @(#)MowingFee.java
 *
 *
 * @author 
 * @version 1.00 2018/9/22
 */
 import java.util.*;

public class MowingFee {
        
    /**
     * Creates a new instance of <code>MowingFee</code>.
     */
    public MowingFee() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int length =0 ;
        int width =0 ;
        int squareFeet = 0;
        int weeklyFee =0;
        int seasonalFee =0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Price range for mowing Fee:");
        System.out.print("\n Weekly fees for mowing a lot below 400 square feet is RM25");
        System.out.print("\n The fee for a lot that is 400 but below 600 square feet is RM35 per week");
        System.out.print("\n The fee for a lot that is 600 square feet and over is RM50 per week " );
        System.out.print("\n Please enter your lawn length:");
        length = sc.nextInt();
        System.out.print("Please enter your lawn width:");
        width = sc.nextInt();
        squareFeet = length * width ;
        
        if (squareFeet<=400)
        {
        	System.out.print("Your weekly Fee =RM25");
        	seasonalFee = 25 * 20;
        }
        else if (squareFeet>400 && squareFeet<=600)
        {
        	System.out.print("Your weekly Fee =RM35");
        	seasonalFee = 35 *20;
        }
        else if (squareFeet>600)
        {
        	System.out.print("Your weekly Fee =RM50");
        	seasonalFee = 50 * 20;
        }
        
        System.out.print("\n The 20-week Seasonal Fee is : RM"+seasonalFee);
        
        
        
    }
}
