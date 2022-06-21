package com.app;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1.Add 2.Subtract 3.Multiply 4.Division 5.Exit");
			choice = s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter first number");
				int num1 = s.nextInt();
				System.out.println("Enter second number");
				int num2 = s.nextInt();
				int sum = num1 + num2;
				System.out.println("The Addition is: "+sum);
				break;
				
			case 2:
				System.out.println("Enter first number");
				num1 = s.nextInt();
				System.out.println("Enter second number");
				num2 = s.nextInt();
				int sub = num1 - num2;
				System.out.println("The Subtraction is: "+sub);
				break;
				
			case 3:
				System.out.println("Enter first number");
				num1 = s.nextInt();
				System.out.println("Enter second number");
				num2 = s.nextInt();
				int mul = num1 * num2;
				System.out.println("The Multiplication is: "+mul);
				break;
				
			case 4:
				System.out.println("Enter first number");
				num1 = s.nextInt();
				System.out.println("Enter second number");
				num2 = s.nextInt();
				if(num2>0) {
					int div = num1/num2;
					System.out.println("The division is: "+div);
				}
				else
					System.out.println("Denominator can't be 0");
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Invalid input");
			}
		}while(choice!=5);
	}

}
