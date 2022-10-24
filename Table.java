/**
 * @(#)Table.java
 *
 *
 * @author 
 * @version 1.00 2018/9/20
 */
 import java.util.*;

public class Table {
        
    /**
     * Creates a new instance of <code>Table</code>.
     */
    public Table() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numberOfTable =0; 
        int woodCode= 0;
        double tablePrice=0;
        
        Scanner sc = new Scanner(System.in);
        
       System.out.print("Please enter Number Of Table :");
        numberOfTable=sc.nextInt ();
       System.out.print("Wood Code :");
       System.out.print("\n 1 - Pine "); // For Display the code 
       System.out.print("\n 2 - Oak "); // For Display the code
       System.out.print("\n 3 - Mahagony "); // For Display the code
       System.out.print("\n Please enter wood code :"); 
        woodCode=sc.nextInt ();
       
       if (woodCode==1)
       {
       	 System.out.print("Pine");
       	 tablePrice = numberOfTable * 100;
       }
       else if (woodCode==2)
       {
       	 System.out.print("Oak");
       	 tablePrice = numberOfTable * 225;
       }
       else if (woodCode==3)
       {
       	 System.out.print("Mahogany");
       	 tablePrice = numberOfTable * 310;
       }
       else              // kalau takda value , takyah letak If . terus Else
       {
       	 System.out.print("Invalid wood code");
       	 tablePrice = 0 ;
       }
       
       System.out.print("\n Table Price : RM"+tablePrice);	 		 		 	
    }
}
