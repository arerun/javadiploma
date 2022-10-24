/**
 * @(#)Force.java
 *
 *
 * @author 
 * @version 1.00 2018/9/13
 */
import java.util.*;
public class Force {
        
    /**
     * Creates a new instance of <code>Force</code>.
     */
    public Force() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double mass = 0;
         double Force =0;

         Scanner sc = new Scanner (System.in) ;
          
         System.out.print ("Please enter mass :");
         mass = sc.nextDouble();
         Force = mass * 9.8;
         System.out.print("Force is :"+Force) ;
    }
}
