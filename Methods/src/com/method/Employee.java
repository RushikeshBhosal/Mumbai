package com.method;

import java.util.Scanner;

public class Employee {
	
	public void getMultiplication(int num) {
		
		for(int i = 0 ;i<=10;i++) {
			int c= num*i;
			
			System.out.println(num + "*" + i +"="+c);
			
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your number");
	    int no = sc.nextInt();
	    Employee emp = new Employee();
	    emp.getMultiplication(no);

	}

}
