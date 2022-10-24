/**
 * @(#)StudentGrade.java
 *
 *
 * @author 
 * @version 1.00 2018/10/18
 */
 import java.util.*;

public class StudentGrade {
        
    /**
     * Creates a new instance of <code>StudentGrade</code>.
     */
    public StudentGrade() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int totalA=0;
        int totalB=0;
        int totalC=0;
        int totalD=0;
        int totalF=0;
        
        char grade = 0; 
        	
        Scanner sc =new Scanner(System.in);
        
        int student =1;
        
        while(student<=3) 
        {
          System.out.print("\nPlease enter your grade [A,B,C,D,F]");
          
          grade = sc.next(). charAt(0);
          
          switch (grade)
          {
          	case 'A': totalA = totalA + 1;
          		      break;
          	case 'B': 
          		       totalB =totalB + 1;
          		       break;
          	case 'C': 
          		       totalC = totalC + 1;
          		       break;
          	case 'D': 
          		       totalD = totalD + 1;
          		       break;
          	case 'F': 
          		       totalF = totalF + 1;
          		       break;
           default : 
           	           System.out.print("\nInvalid Grade entered");
                      break ;             	       	       	
          }
          student = student+1;
        }
     System.out.print("Total student grade A is :"+totalA);
     System.out.print("\nTotal student grade B is :"+totalB);
     System.out.print("\nTotal student grade C is :"+totalC);
     System.out.print("\nTotal student grade D is :"+totalD);
     System.out.print("\nTotal student grade F is :"+totalF);
    }
}
