import java.util.*;

public class Celsius_Farenheit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		float Celsius, Farenheit;

		System.out.print("Please enter the celsius temperature to chagnge to Farenheit");
		Celsius = sc.nextInt();

		Farenheit = (Celsius * 9/5 + 32);

		System.out.println("Farenheit of Celsius " + Celsius + " is " + " = " + Farenheit);
	}
}
