import java.util.*;
public class array
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int randomNumber, maxValue;
		int n;
		maxValue = 20;


		randomNumber = rand.nextInt(maxValue);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store\n");
		n = sc.nextInt();


		int[] array = new int[n];

		for (int i = 0; i < n; i ++)
		{
			array[i] = rand.nextInt(maxValue);

		}

		for (int i = 0; i < n; i ++)
		{
			System.out.println(array[i]);
		}



	}

}















/*
public class array
{
	public static void main(String[] args)
	{
	
		Random rand = new Random();
		int randomNumber, maxValue;
	
		maxValue = 20;

		randomNumber = rand.nextInt(maxValue);


		int[] array = new int[randomNumber];

		for (int i = 0; i < randomNumber; i++)
		{
			array[i] = i;	
		}


		for (int i = 0; i < randomNumber; i++)
		{
			System.out.print(array[i]);
		}

		//ex) random number is 5
		//	  0 1 2 3 4


	}
}
*/
