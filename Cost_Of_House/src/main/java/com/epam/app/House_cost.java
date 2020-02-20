package com.epam.app;
import java.util.Scanner;
public class House_cost extends CostOfHouse {
      Scanner s=new Scanner(System.in);
      @SuppressWarnings("resource")
	 public void House_cost1()
  	{
  		Scanner s=new Scanner(System.in);
  		System.out.println("Enter the area of site in square feet");
  		float area=s.nextFloat();
  		System.out.println("Do you need fully automated home\n1.YES\n2.NO");
  		int choice=s.nextInt();
  		if (choice==2)
  		{
  			System.out.println("select the type of material you need\n1.Standard material\n2.Above Standard material\n3.High Standard material");
  			int choice0=s.nextInt();
  			if (choice0<1 && choice0>3)
  			{
  				System.out.println("Enter a valid choice...!");
  			}
  			else
  			{
  				System.out.println("cost for house construction : "+find_cost_house(choice0,area));
  			}
  		}
  		else if(choice==1)
  		{
  			System.out.println("cost for house construction : "+find_cost_house(4,area));
  		}
  		else
  		{
  			System.out.println("Enter a valid choice");
  		}
  	}
  	public static void main(String args[])
  	{
  		House_cost obj1=new House_cost();
  		obj1.House_cost1();
  	}

}
