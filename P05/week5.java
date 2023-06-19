import java.util.*;

public class week5
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int rows, columns;




		System.out.print("\nHow many rows do you want?\n");
		rows = sc.nextInt();

		System.out.print("\nHow many columns do you want?\n");
		columns = sc.nextInt();

		int arr[][] = new int[rows][columns];


		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				arr[i][j] = i*j;		
			}
		}

		System.out.print("\nData you entered : \n");


		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();

		}




	}
}
