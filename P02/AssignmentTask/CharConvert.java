import java.util.*;

public class CharConvert
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char ch;

		System.out.println("Enter a character\n");
		ch = sc.next().charAt(0);

		int ascii = (int) ch;

		System.out.println("The ASCII for this characer " + ch + " is " + ascii);
	}
}
