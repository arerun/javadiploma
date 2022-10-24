/**
 * @(#)Temperature.java
 *
 *
 * @author Azran & Jep 
 * @Lab 1 : Convert celcius to fahrenheit 
 *          Input : celcius
 *          Process : fahrenheit = 1.8*celcius + 32 
 *          Output : fahrenheit 
 * @version 1.00 2018/8/30
 */
import java.util.*; 
public class Temperature {
        
    /**
     * Creates a new instance of <code>Temperature</code>.
     */
    public Temperature() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable declaration 
           double celcius = 0; //input
           double fahrenheit = 0; //output 
           
           Scanner sc = new Scanner(System.in);  // object sc untuk baca input 
           
           System.out.print("Please enter temperature in Celcius :"); //prompt
           celcius = sc.nextDouble(); // sc baca input dan convert kepada double
           fahrenheit = 1.8 * celcius + 32; // process 
           System.out.print("Value in Fahrenheit is :"+fahrenheit); // display fahrenheit      
    }
}
