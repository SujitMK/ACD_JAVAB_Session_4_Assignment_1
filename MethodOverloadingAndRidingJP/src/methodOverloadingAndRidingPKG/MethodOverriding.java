package methodOverloadingAndRidingPKG;

public class MethodOverriding extends MethodOverloading{
	
	
	// Addition Method with two parameters overridden 
	public int addtion(int a, int b)
	{
		int bonus = 1000;
		int c = a+b+bonus;
		System.out.println();
		System.out.println("Addition of Int A,B and Bonus(1000) is : "+ c);
		return c;
	}
	
	// Addition Method with three parameters overridden 
	public int addtion(int a, int b, int c)
	{
		int bonus = 1000;
		int d = a+b+c+bonus;
		System.out.println();
		System.out.println("Addition of Int A, B, C and Bonus(1000) is : "+ d);
		return d;
	}

}
