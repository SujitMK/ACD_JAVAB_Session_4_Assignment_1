package methodOverloadingAndRidingPKG;          // declared a package

public class MethodOverriding extends MethodOverloading{          // Declared a class which extends another class
	
	
	// Addition Method with two parameters overridden 
	public int addtion(int a, int b)
	{
		int bonus = 1000;         // declared and initialized a variable
		int c = a+b+bonus;          // declared a variable and calculating a sum
		System.out.println();         // printing blank line
		System.out.println("Addition of Int A,B and Bonus(1000) is : "+ c); // printing info
		return c;            // returing a int type value
	}
	
	// Addition Method with three parameters overridden 
	public int addtion(int a, int b, int c)
	{
		int bonus = 1000;             // declared and initialized a variable
		int d = a+b+c+bonus;                // declared a variable and calculating a sum
		System.out.println();             // printing blank line
		System.out.println("Addition of Int A, B, C and Bonus(1000) is : "+ d); // printing info
		return d;                 // returing a int type value
	}

}
