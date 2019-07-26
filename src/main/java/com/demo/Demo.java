package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		//new Demo().Firstprimenumber();
		//findFabonacci();
//		Parent parent = new Child();
//		parent.run();
		TestClass t = new TestClass() {
		};
		t.method();
	}
	
public static void findFabonacci() {
		
		/*
		 * In this Method we find the Fabonacci series.
		 * @param input takes the input from the user
		 * @return Nothing
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		//Printing Message
		
		System.out.print("Enter upto how many numbers of values you want in Fibonacci series");
		int input=scanner.nextInt();
		
		/*
		 * @param previous is used to store previous values of the series
		 * @param next is used to store next value of the series
		 */
		
		//Assigning Values
		int previous=0;
		int next=1;
		
		//Printing Message
		
		System.out.print("Your Fibonacci series= ");
		
		/*
		 * @param index is for incrementing the index
		 * @param result is for storing the Result
		 */
		
		//Assigning Values
		int index=0;
		int result = 0;
		//Printing Message
		System.out.println("Fabonacci Series of number "+input+" is ");
		
		/*In while loop, storing previous summation in result.
		 *Giving previous variable to the next
		 *and result value to the next variable  
		 */
		
		while(index<input)
		{
			System.out.print(previous+" ");
			result=previous+next;
			previous=next;
			next=result;
			index++;
		}
	}

	public void Firstprimenumber() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter prime number");
		int n=s.nextInt();
		int count=0;
		while(count!=2)
		{
		n++;
		int i=1;
		count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("next immediate prime number is"+ n);
		}
		}
	}
	
	private void month(int monthNumber) {
		
		switch (monthNumber) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;

		default:
			System.out.println("Invalid Month");
			break;
		}

	}
	
	private void loopArray() {
		ArrayList numbers = new ArrayList();
		for (int index = 0; index < numbers.size(); index++) {
			
		}
		
		while (numbers.size() > 10) {
		
			
		}
		
		for (Object object : numbers) {
			
		}
		
		
		 
		do {
			
		} while (numbers.size() > 10);
	}
	
	

}
