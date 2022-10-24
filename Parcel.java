/**
 * @(#)Parcel.java
 *
 *
 * @author 
 * @version 1.00 2018/9/21
 */
 import java.util.*;

public class Parcel {
        
    /**
     * Creates a new instance of <code>Parcel</code>.
     */
    public Parcel() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double parcelWeight = 0;
        double charge = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Parcel weight charge :");
        System.out.print("\n <2.50 = RM 3.50");
        System.out.print("\n 2.50 to 5.0 = RM 2.85");
        System.out.print("\n >5.0 = RM 2.40");
        System.out.print("\n Please enter parcel weight:");
         parcelWeight = sc.nextDouble();

        
        if (parcelWeight <= 2.5 )
        {
        	System.out.print("RM3.50");
        }
        else if (parcelWeight >2.50 && parcelWeight<=5.0)
        {
        	System.out.print("RM2.85");
        }
        else if (parcelWeight>5.0)
        {
        	System.out.print("RM2.45");
        }
        
        System.out.print("\n The charge is : RM"+parcelWeight);
    }
}
