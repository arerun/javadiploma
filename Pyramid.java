/**
 * @(#)Pyramid.java
 *
 *
 * @author 
 * @version 1.00 2018/9/13
 */
import java.util.*;
public class Pyramid {
        
    /**
     * Creates a new instance of <code>Pyramid</code>.
     */
    public Pyramid() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Base = 0;
         double Height = 0;
         double PyramidVolume =0;

         Scanner sc = new Scanner (System.in) ;
          
         System.out.print ("Please enter Base :");
         Base = sc.nextDouble();
         System.out.print ("Please enter Height:");
         Height = sc.nextDouble();
         PyramidVolume = PyramidVolume = 1/3 * Base * Height;
         System.out.print("Pyramid volume is :"+PyramidVolume) ;
    }
}
