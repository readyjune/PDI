import java.util.*;

public class menu
{
	public static void main(String[] args)
	{


		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;

		a = 0;
		b = 0;
		d = 0;
		e = 10;

		do{
			System.out.print("\nWhat would you like to do?\n1. Sum of 2 Integer\n2. Product of 2 Integer\n3. Determin if 2 Integer are Divisible\n0. Exit\n");
			c = sc.nextInt();
			while  (c > 3 || c < 0)
			{
				System.out.print("\nPlease put the write number of menu between 0~3\n");
				c = sc.nextInt();

			}

			if (c == 1 || c == 2 || c == 3)			
			{
				System.out.print("\ngive me an first value again\n");
				a = sc.nextInt();

				while (a < d || a > e)
				{
					System.out.print("\nError : The value must be between 0 and 10, please put the valid number again\n");
					System.out.print("\ngive me an first value again\n");
					a = sc.nextInt();
				}

				System.out.print("\ngive me an second value\n");
				b = sc.nextInt();

				while ( b < d || b > e)
				{
					System.out.print("\nError : The value must be between 0 and 10, please put the valid number again\n");
					System.out.print("\ngive me an second value again\n");
					b = sc.nextInt();
				}
			}

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


		}while (c != 0);





		System.out.print("Goodbye!\n");

	}
}
