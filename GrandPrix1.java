/**
 * @(#)GrandPrix.java
 *
 *
 * @author 
 * @version 1.00 2018/10/18
 */
 import java.util.*;

public class GrandPrix {
        
    /**
     * Creates a new instance of <code>GrandPrix</code>.
     */
    public GrandPrix() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char teamName =0; //char kalau case 
        char point = 0;
        int totalA =0; //
        int totalB =0;
        int totalC =0;
        int totalD =0;
        int totalE =0;
        int totalF =0;
        int totalG =0;
        int totalH =0;
        int totalI =0;
        int totalJ =0;
        int totalK =0;
        
        
        
        Scanner sc = new Scanner(System.in);
        
        int round = 1 ;
        
        while (round<=2)
        {
        	System.out.print("Please choose the Team Name :");
            System.out.print("\n1.Scuderia Ferrari ");
            System.out.print("\n2.Sahara Force India F1 Team ");
            System.out.print("\n3.Racing Point Force India F1 Team " );
            System.out.print("\n4.Haas F1 Team ");
            System.out.print("\n5.McLaren F1 Team ");
            System.out.print("\n6.Mercedes AMG Petronas Motorsport ");
            System.out.print("\n7.Aston Martin Red Bull Racing  ");
            System.out.print("\n8.Renault Sport Formula One Team ");
            System.out.print("\n9.Alfa Romeo Sauber F1 Team ");
            System.out.print("\n10.Red Bull Toro Rosso Honda ");
            System.out.print("\n11.William Martini Racing ");
            System.out.print("\nEnter Code [1,2,3 - 11]:" );
        
            teamName = sc.next().charAt(0); // Kalau character mesti buat macam ni
            
            System.out.print("Please choose the point :");
            System.out.print("\n1.25");
            System.out.print("\n2.18");
            System.out.print("\n4.15");
            System.out.print("\n5.12");
            System.out.print("\n6.10");
            System.out.print("\n7.8");
            System.out.print("\n8.6");
            System.out.print("\n9.4");
            System.out.print("\n10.2");
            System.out.print("\n11.1");            
            System.out.print("\nPlease Enter Code [1,2,3 - 11]:" );
        
            point = sc.next(). charAt(0);

			if(teamName == 1)
			{
				if(point = 1)
				{
					
				}
			}

            
            switch (point)
            {
            	case 1 : 
            		       totalA = totalA + 25;
            	           break;
            	case 2 :   totalB = totalB + 18;
            	           break;
            	case 'C' : totalC = totalC + 15;
            	           break;
            	case 'D' : totalD = totalD + 12;
            	           break;
            	case 'E' : totalE = totalE + 10;
            	           break;
            	case 'F' : totalF = totalF + 8;
            	           break;
            	case 'G' : totalG = totalG + 6;
            	           break;
            	case 'H' : totalH = totalH + 4;
            	           break;
            	case 'I' : totalI = totalI + 2;
            	           break;
            	case 'J' : totalJ = totalJ + 1;
            	           break;
            	case 'K' : totalK = totalK + 0;
            	           break;
            	default : System.out.print("Invalid point entered");
            	           break;                                             	                                  
            }
            round = round + 1 ;
        }
      System.out.print ("\nPosition 1st :"+totalA);
      System.out.print ("\nPosition 2nd :"+totalB);
      System.out.print ("\nPosition 3rd :"+totalC);
      System.out.print ("\nPosition 4th :"+totalD);
      System.out.print ("\nPosition 5th :"+totalE);
      System.out.print ("\nPosition 6th :"+totalF);
      System.out.print ("\nPosition 7th :"+totalG);
      System.out.print ("\nPosition 8th :"+totalH);
      System.out.print ("\nPosition 9th :"+totalI);
      System.out.print ("\nPosition 10th :"+totalJ);
    }
}
