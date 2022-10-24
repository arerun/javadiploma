/**
 * @(#)Room.java
 *
 *
 * @author 
 * @version 1.00 2018/10/25
 *Find_Area_And_Cost
 *    UserInputLength
      CalculateRoomAre
      CalculateTotalCost
 */
 import java.util.*;

public class Room {
        
    /**
     * Creates a new instance of <code>Room</code>.
     */
    static Scanner sc = new Scanner(System.in); 
    
    public Room() {
    }
    
     static double UserInputLength ()
    {
    	double length ;
    	System.out.print("Enter Room's length:");
    	length = sc.nextDouble();
    	return length;
    }
    
     static double CalculateRoomArea(double length)
    {
    	double area; 
    	area = length * length;
    	return area ; 
    }
    
     static void CalculateTotalCost(double area)
    {
    	double totalCost; 
    	totalCost = area * 6.5;
    	System.out.print("Total Cost : RM "+totalCost);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double newLength;
        double newArea;
        newLength = UserInputLength();
        newArea = CalculateRoomArea(newLength);
        CalculateTotalCost(newArea);
    }
}








