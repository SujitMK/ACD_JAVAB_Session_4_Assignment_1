package methodOverloadingAndRidingPKG;    // declared a package

import java.util.Scanner;          // importing a scanner utility

public class MethodOverloadingAndRiding {             // declared and defined a class

	public static void main(String[] args) {                 // Main method intialized
		
		// Using Scanner to take dynamic/runtime values for parameters
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println();
        System.out.println("Will show you addtion of Two and Three Numbers."); // printing info
        System.out.println();
        
        System.out.println("Enter Int value of A"); // printing info
        int a = input.nextInt();        //Taking user input
        
        System.out.println("Enter Int value of B"); // printing info
        int b = input.nextInt();          //Taking user input
        
        System.out.println("Enter Int value of C"); // printing info
        int c = input.nextInt();                 //Taking user input
        
        System.out.println("Enter Double value of D"); // printing info
        double d = input.nextDouble();               //Taking user input
        
        System.out.println();                      // printing blank line
		System.out.println("Addition of Numbers Using Method Overloading Is As Below"); // printing info
        
		// Creating an Object and calling overloaded methods
        MethodOverloading mol = new MethodOverloading();     // creating an object          
        
        mol.addition(a, b);        // calling a method
        mol.addition(a, b, c);      // calling a method
        mol.addition(a, b, d);        // calling a method
        
        
        System.out.println();            //Printing a blank line
		System.out.println("Addition of Numbers Using Method Overriding Is As Below"); // printing info
       
	// Creating an Object and calling overrided methods
        MethodOverriding mor = new MethodOverriding();
        
        mor.addtion(a, b);                  // calling a method
        mor.addtion(a, b, c);                 // calling a method
        
        input.close();                      // Closing scanner 

	}

}
