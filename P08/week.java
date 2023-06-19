import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public student
{
	String name;
	int id;
	int grade; 
}

public class week
{
	public static void main(String[] args)
	{

			student s1 = new student();
			


		try
		{


			File myObj = new File("example_data.csv");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine())
			{
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}	
		catch (FileNotFoundException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();

		}

	}
}
