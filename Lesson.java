/**
 * @(#)Lesson.java
 *
 *
 * @author 
 * @version 1.00 2018/10/4
 */
import java.util.*;
public class Lesson {
        
    /**
     * Creates a new instance of <code>Lesson</code>.
     */
    public Lesson() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char lessonID =0; //char kalau case 
        char levelID =0; // 
        double fees =0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please choose the Lesson :");
        System.out.print("\n1. Swim");
        System.out.print("\n2. Snorkel");
        System.out.print("\n3. Dive " );
        System.out.print("\nEnter Code [1,2 or 3]:" );
        
        lessonID = sc.next().charAt(0); // Kalau character mesti buat macam ni 
        
        System.out.print("Please choose the difficulty :");
        System.out.print("\nB. Beginner");
        System.out.print("\nI. Intermediate");
        System.out.print("\nA. Advanced " );
        System.out.print("\nPlease Enter Code [B,I or A]:" );
        
        levelID = sc.next(). charAt(0);
        
        switch (lessonID)
        {
        	case '1' :
        		    if(levelID =='B')
        		    {
        		        fees = 50 + 10;
        		    }
        		    else if(levelID =='I')
        		    {
        		    	fees = 50 + 0;
        		    }
        		    else if(levelID =='A')
        		    {
        		    	fees = 50 - 15;
        		    }
        		     break;
           case '2' :
        		    if(levelID =='B')
        		    {
        		        fees = 25 + 10;
        		    }
        		    else if(levelID =='I')
        		    {
        		    	fees = 25 + 0;
        		    }
        		    else if(levelID =='A')
        		    {
        		    	fees = 25 - 15;
        		    }
        		    break;
         case '3' :
        		    if(levelID =='B')
        		    {
        		        fees = 100 + 10;
        		    }
        		    else if(levelID =='I')
        		    {
        		    	fees = 100 + 0;
        		    }
        		    else if(levelID =='A')
        		    {
        		    	fees = 100 - 15;
        		    }
        		    break;
         default  : 
         	       System.out.print("Invalid code entered");
        }		    
        
        System.out.print("\nYour fees is = RM"+fees);
        
        		  	
           
        
        
        
    }
}
