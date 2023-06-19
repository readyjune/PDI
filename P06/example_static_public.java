import java.util.*;

public class example_static_public
{
	//Static method
	static void myStaticMethod()
	{
		System.out.println("Static methods can be called without creating objects");
	}

	public void myPublicMethod()
	{
		System.out.println("Public methods must be called by creating objects");
	}

	public static void main(String[] args)
	{
		myStaticMethod(); //Call the static method	
		// myPublicMethod(); This would compile an error

		example_static_public myObj = new example_static_public(); // Create an object of Main
		myObj.myPublicMethod(); // Call the public method on the object.

	}	
}
