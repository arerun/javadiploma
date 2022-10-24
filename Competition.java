/**
 * @(#)Competition.java
 *
 *
 * @author 
 * @version 1.00 2018/10/25
 */
 import java.util.*;

public class Competition {
        
    /**
     * Creates a new instance of <code>Competition</code>.
     */
    static Scanner sc = new Scanner(System.in);
     
    public Competition() {
    }
    
    static String GetName ()
    {
    	String name;
    	System.out.print("Enter name :");
    	name = sc.next();
    	return name; 
    }
    
    static int GetAge()
    {
    	int age ;
    	System.out.print("Enter Age:");
    	age = sc.nextInt();
    	return age;
    }
    
    static int GetContest ()
    {
    	int contestID;
    	System.out.print("List of contest:");
    	System.out.print("\n1. Story Telling");
    	System.out.print("\n2. Spelling Bee");
    	System.out.print("\n3. Cross Word Puzzle");
    	System.out.print("\nEnter contest:");
        contestID = sc.nextInt();
    	return contestID ;  	
    }
    
    static void ContestDetail (String name , int age , int contestID)
    {  
        System.out.print("Contest Detail:-"); 
        System.out.print("\nName:"+name);
        System.out.print("\nAge:"+age);
        System.out.print("\nContest:"+contestID);
    	
    	switch(contestID)
    	{
    		case 1 :System.out.print("Story Telling"); 
    			    if(age>=6 && age<=12)
    	     		System.out.print("\nStatus :Eligible");
    	     		else
    	     		System.out.print("\nStatus :Not Eligible");    	     		
    			    break;
    		
    		case 2 :System.out.print("Spelling Bee");
    			    if (age>=12 && age<=16)
    			    System.out.print("\nStatus :Eligible");
    			    else
    			    System.out.print("\nStatus : Not Eligible");
    			    break;
    		   
    		case 3 :System.out.print("Cross Word Puzzle");  
    			    if (age>=9 && age <=12) 		
    			    System.out.print("\nStatus :Eligible");
    			    else
    			    System.out.print("\nStatus :Not eligible");
    			    break;
    			    
    	   default : System.out.print("Invalid code entered");
    	   	        break;   	
    		
    	}
        
        
        
       
         	
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String newName; 
        int newAge;
        int newContestID;
        char answer = 'Y';
        do{
        newName = GetName ();
        newAge = GetAge ();
        newContestID = GetContest();
        ContestDetail(newName, newAge , newContestID);
        System.out.print("\nDo you want to continue [Y/N]?:");
        answer = sc.next().charAt(0);
        }while(answer!='N');
       
    }
}
