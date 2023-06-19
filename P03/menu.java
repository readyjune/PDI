import java.util.*;

public class menu
{
	public static void main(String[] args)
	{
		System.out.print("Please enter a two numbers for input");
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();

		System.out.print("What woudl you like to do?\n1. Sum of 2 Integer\n2. Product of 2 Integer\n3. Determin if 2 Integer are Divisible\n0. Exit");

		c = sc.nextInt();

		if (c == 1)
		{
			System.out.print("Sum of 2 Integer you put is " + (a+b) );
		}
		else if (c == 2)
		{
			if (a * b < 0)
			{
				System.out.print("Product of 2 Integer is Minus");
			}
			else if (a * b > 0)
			{
				System.out.print("Product of 2 Integer is Plus");
			}
		}
		else if (c == 3)
		{
			if (a % b == 0)
			{
				System.out.print("It's Divisible");
			}
			else
			{
				System.out.print("It's NOT Divisible");
			}
		}
		else if (c == 0)
		{
			System.out.print("Goodbye!");
		}
		else
		{
			System.out.print("Please choose the right number");
		}
	}
}
