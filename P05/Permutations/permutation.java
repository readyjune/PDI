import java.util.*;

public class permutation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, r;


		System.out.println("\n Give me an number of element in the set (n)\n");
		n = sc.nextInt();

		while (n<5 || n >50)
		{
			System.out.println("\nplease input the number between 5-50\n");
			n = sc.nextInt();
		} 
	
		System.out.println("\n choose the maximum number (r) \n");
		r = sc.nextInt();

		while (r<2 || r>n)
		{
			System.out.println("\nplease choose the maximum number between 2~" + n + "\n");
			r = sc.nextInt();
		}

		int arr[] = new int[r-1];

	//	arr[i] = n*(n-1)

		for(int i=0; i<r-1; i++)
		{
			arr[i] = perm(n, r-i);
					//n*(n-1)*(n-2)...
					//n*(n-1)*(n-2)*(n-3)...
		}
		

		for(int i=0; i<r-1; i++)
		{
			System.out.print(arr[i] + " ");
		}




/*
		public static int fact(int n)
		{
			if (n<=1)
				return n;
			else
				return fact(n-1)*n;


		}
*/

/*
		public int fibonacci(int n)
		{
			int (n==0)
			{
				return 0;
			}
			else if (n==1)
			{
				return 1;
			}
			else
			{
				return fibonacci(n-1) + fibonacci(n-2);
			}



		}
*/

	}
	

	public static int perm(int n, int r)
	{
		int i;
		int answer = 1;
//			System.out.println(fact(n)/fact(n-r);
		for(i=n-r+1; i<n+1; i++)
		{
			answer = answer * i;
		}
		return answer;

	}


}

