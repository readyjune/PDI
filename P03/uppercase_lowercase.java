import java.util.*;

public class uppercase_lowercase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("If you want to use uppercase to lowercase, please press 1, or 2 ---   ");

		int select;
		String txt;

		select = sc.nextInt();

		//1\n


		if (select == 1)
		{

			System.out.print("Enter a word to change to lowercase\n");
			txt = sc.next();
			System.out.println(txt.toLowerCase());

		// nextLine() = it will include \n
		// next() = it will ignore \n

		}

		else if (select == 2)
		{

			System.out.print("Enter a word to change to uppercase\n");
			txt = sc.next();
			System.out.println(txt.toUpperCase());

		}

		else
		{
			System.out.print("Please press right number\n");
		

		}


		
	}
}
