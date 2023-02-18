package com.method;

import java.util.Scanner;

public class Calculator {
	
	public static void calulation(int a , int b) {
		
		int c = a+b;
		System.out.println(" Addition is >> " + c);
		
		int d=a-b;
		System.out.println(" Substraction is >> " + d);
		
		float z =a/b;
		System.out.println(" Division is >>" + z);
		
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First value");
		int result = sc.nextInt();
		System.out.println("Enter the second value");
		int result2=sc.nextInt();
		Calculator.calulation(result, result2);

	}

}
