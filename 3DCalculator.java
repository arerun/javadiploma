/**
 * @(#)3DCalculator.java
 *
 *
 * @author : Azran
 * @Lab 1 :
 *          Input :
 *          Process :
 *          Ouput :
 * @version 1.00 2018/9/11
 */
import java.util.*;
public class 3DCalculator {

    /**
     * Creates a new instance of <code>3DCalculator</code>.
     */
    public 3DCalculator() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radius = 0;
        double height = 0;
        double width = 0;
        double length = 0;
        int side = 0;

        double cylinderVolume =0;
        double pyramidVolume =0;
        double sphereVolume =0;
        double cuboidVolume =0;
        double coneVolume =0;
        int shape = 0;


        Scanner sc = new Scanner(System.in);

        int decision = 1;

        while(decision<=2)
        {
			System.out.print("**************************************************************");
			System.out.print("\n3D Shape :");
			System.out.print("\n1.Cylinder");
            System.out.print("\n2.Pyramid");
			System.out.print("\n3.Sphere");
			System.out.print("\n4.Cuboid");
			System.out.print("\n5.Cone");
			System.out.print("\nPlease Choose the shape you want [1,2,3,4,5 or 6] =");
		    System.out.print("**************************************************************");

		    shape = sc.nextInt();

		    switch(shape)
  		    {
			    case 1: System.out.print("Enter radius ");
                        radius = sc.nextDouble();
                        System.out.print("Enter height");
                        height = sc.nextDouble();
				        cylinderVolume = 2 * 3.142 * radius * height;
				        break;
				case 2: System.out.print("Enter side ");
                        radius = sc.nextInt();
                        System.out.print("Enter height");
                        height = sc.nextDouble();
				        pyramidVolume = 1/3 * side * side * height;
				        break;
				case 3: System.out.print("Enter radius ");
                        radius = sc.nextDouble();
				        sphereVolume = 4 * 3.142 * radius * radius;
				        break;
				case 4: System.out.print("Enter length ");
                        length = sc.nextDouble();
                        System.out.print("Enter width");
                        width = sc.nextDouble();
                        System.out.print("Enter height");
                        height = sc.nextDouble();
				        cuboidVolume = length * width * height;
				        break;
				case 5: System.out.print("Enter radius ");
                        radius = sc.nextDouble();
                        System.out.print("Enter height");
                        height = sc.nextDouble();
				        coneVolume = 1/3 * 3.142 * radius * radius * height;
				        break;
			   default: System.out.print("You entered the wrong code");
			            break;
		  }
		 decision = decision + 1;
	    }
	  System.out.print("Your volume is :"+cylinderVolume);
	  System.out.print("Your volume is :"+pyramidVolume);
	  System.out.print("Your volume is :"+sphereVolume);
	  System.out.print("Your volume is :"+cuboidVolume);
	  System.out.print("Your volume is :"+coneVolume);







    }
}