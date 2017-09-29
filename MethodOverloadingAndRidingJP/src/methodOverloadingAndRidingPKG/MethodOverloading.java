package methodOverloadingAndRidingPKG;

public class MethodOverloading {
	
	
	// Addition Method with two int parameters
	public int addition(int a, int b)
	{
		int c = a+b;
		System.out.println();
		System.out.println("Addition of Int A and B is : "+ c);
		return c;
	}
	
	// Addition Method with three int parameters
	public int addition(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println();
		System.out.println("Addition of Int A, B and C is : "+ d);
		return d;
	}
	
	// Addition Method with two int and one double parameters
	public double addition(int a, int b, double d)
	{
		d = a+b+d;
		System.out.println();
		System.out.println("Addition of Int A, B and Double D is : "+ d);
		return d;
	}

}
