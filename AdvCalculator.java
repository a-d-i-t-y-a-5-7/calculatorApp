package com.app;

import java.util.Scanner;

public class AdvCalculator {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1.Square 2.Square Root 3.Exit");
			choice = s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter number");
				double num = s.nextDouble();
				double sqr = num * num;
				System.out.println("The square of "+num+" is "+sqr);
				break;
				
			case 2:
				System.out.println("Enter number");
				num = s.nextDouble();
				double sqrt = Math.sqrt(num);
				System.out.println("The square root of "+num+" is "+sqrt);
				break;
				
			case 3:
				break;
				
			default:
				System.out.println("Invalid input");
			}
		}while(choice!=3);
	}

}
