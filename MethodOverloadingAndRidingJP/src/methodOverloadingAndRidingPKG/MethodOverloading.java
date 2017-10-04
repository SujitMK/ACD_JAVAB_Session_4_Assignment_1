package methodOverloadingAndRidingPKG;            // Package declared 

public class MethodOverloading {                  // Method overloading class declared and defined 
	
	
	// Addition Method with two int parameters
	public int addition(int a, int b)
	{
		int c = a+b;        // Adding a and b
		System.out.println();  // printing blank line
		System.out.println("Addition of Int A and B is : "+ c);    // printing info
		return c;           //returning an int type value
	}
	
	// Addition Method with three int parameters
	public int addition(int a, int b, int c)
	{
		int d = a+b+c;                 // calculating sum
		System.out.println();   // printing blank line
		System.out.println("Addition of Int A, B and C is : "+ d); // printing info
		return d;                  //returning an int type value
	}
	
	// Addition Method with two int and one double parameters
	public double addition(int a, int b, double d)
	{
		d = a+b+d;                 // calculating sum
		System.out.println();   // printing blank line
		System.out.println("Addition of Int A, B and Double D is : "+ d); // printing info
		return d;            //returning an int type value
	}

}
