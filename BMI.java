/**
 * @(#)BMI.java
 *
 *
 * @author 
 * @version 1.00 2018/9/13
 */
import java.util.*;
public class BMI {
        
    /**
     * Creates a new instance of <code>BMI</code>.
     */
    public BMI() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Weight = 0;
        double Height = 0;
        double BMI = 0; 
        	
      Scanner sc = new Scanner (System.in);
      
        System.out.print ("Please enter Weight :");
         Weight = sc.nextDouble();
        System.out.print ("Please enter Height:");
         Height = sc.nextDouble();
        BMI = Weight/(Height/100.0)*(Height/100.0);  
        System.out.print("BMI is :"+BMI) ;
    }
}