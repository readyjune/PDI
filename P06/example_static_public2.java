import java.util.*;

public class example_static_public2
{
	public void fullThrottle()
	{
		System.out.println("The car is going as fast as it can!");
	}

	public void speed(int maxSpeed)
	{
		System.out.println("Max speed is: " + maxSpeed);
	}

	public static void main(String[] args)
	{
		example_static_public2 myCar = new example_static_public2();
		myCar.fullThrottle();
		myCar.speed(200);

	}


}
