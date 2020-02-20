package epam.com.cleancode_serialization;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App extends Interest_Calculator{
	Scanner s=new Scanner(System.in);
	void App1()
	{
		System.out.println("Enter the type of interest\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		int type=s.nextInt();
		if(type==1)
		{
			simple_Interest();
		}
		else if(type==2)
		{
			compound_Interest();
		}
		else
			System.out.println("Enter a valid option.");
	}
	void simple_Interest()
	{
		System.out.println("Enter principal amount:");
		float principal_amount=s.nextFloat();
		System.out.println("Enter number of years:");
		int years=s.nextInt();
		System.out.println("Enter rate of interest:");
		float rate_of_interest=s.nextFloat();
		System.out.println("Simple interest is "+simple_interest(principal_amount,years,rate_of_interest));
	}
	void compound_Interest()
	{
		System.out.println("Enter principal amount");
		float principal_amount=s.nextFloat();
		System.out.println("Enter number of times to be calculated");
		int times_calc=s.nextInt();
		System.out.println("Enter number of years");
		int years=s.nextInt();
		System.out.println("Enter rate of interest");
		float rate_of_interest=s.nextFloat();
		System.out.println("Compound interest is "+compound_interest(principal_amount,times_calc,years,rate_of_interest));
	}
   static void main(String args[])
	{
		App obj1=new App();
		obj1.App1();
	}

 
}

