package methodOverloadingAndRidingPKG;

import java.util.Scanner;

public class MethodOverloadingAndRiding {

	public static void main(String[] args) {
		
		// Using Scanner to take dynamic/runtime values for parameters
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println();
        System.out.println("Will show you addtion of Two and Three Numbers.");
        System.out.println();
        
        System.out.println("Enter Int value of A");
        int a = input.nextInt();
        
        System.out.println("Enter Int value of B");
        int b = input.nextInt();
        
        System.out.println("Enter Int value of C");
        int c = input.nextInt();
        
        System.out.println("Enter Double value of D");
        double d = input.nextDouble();
        
        System.out.println();
		System.out.println("Addition of Numbers Using Method Overloading Is As Below");
        
		// Creating an Object and calling overloaded methods
        MethodOverloading mol = new MethodOverloading();            
        
        mol.addition(a, b);
        mol.addition(a, b, c);
        mol.addition(a, b, d);
        
        
        System.out.println();
		System.out.println("Addition of Numbers Using Method Overriding Is As Below");
       // Creating an Object and calling overrided methods
        
        MethodOverriding mor = new MethodOverriding();
        
        mor.addtion(a, b);
        mor.addtion(a, b, c);
        
        input.close();                      // Closing scanner 

	}

}
