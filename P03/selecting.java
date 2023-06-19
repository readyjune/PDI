import java.util.*;

public class selecting
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);


		System.out.print("Which temperature scale are you converting from?\n(C)elsius\n(F)arenheit");

		
		float Celsius, Farenheit;
		char select;

		select = sc.next().charAt(0);

		if (select ==  'C')
		{

			System.out.print("Please enter the celsius temperature to chagnge to Farenheit");
			Celsius = sc.nextInt();
			Farenheit = (Celsius * 9/5 + 32);
			System.out.println("Farenheit of Celsius " + Celsius + " is " + " = " + Farenheit);

		}
		else if (select ==  'F')
		{
			System.out.print("Please enter the Farenheit temperature to chagnge to Celsius");
			Farenheit = sc.nextInt();
			Celsius = (Farenheit-32)*5/9;
			System.out.println("Celsius of Farenheit " + Farenheit + " is " + " = " + Celsius);			

		}
		else 
		{
			System.out.println("Please put the right character");
		}


	}
}
