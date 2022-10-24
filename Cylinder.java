/**
 * @(#)Cylinder.java
 *
 *
 * @author 
 * @version 1.00 2018/9/13
 */
import java.util.*;
public class Cylinder {
        
    /**
     * Creates a new instance of <code>Cylinder</code>.
     */
    public Cylinder() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radius = 0;
         double height = 0;
         double CylinderVolume =0;

         Scanner sc = new Scanner(System.in);
          
         System.out.print ("Please enter radius :");
         radius = sc.nextDouble();
         System.out.print ("Please enter height:");
         height = sc.nextDouble();
         CylinderVolume = 3.142 * radius * radius * height; 
         System.out.print("Cylinder volume is:"+CylinderVolume);
    
    }
}
