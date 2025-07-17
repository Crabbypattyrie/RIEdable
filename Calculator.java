package javaFundamentals;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int given1;
		int given2;
		int ope;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entered First Number:");
		given1 = scan.nextInt();
		
		System.out.print("Entered Second Number:");
		given2 = scan.nextInt();
		
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
		System.out.print("Enter the Operation: ");
		ope = scan.nextInt();
		
		if(ope == 1)System.out.println(given1 + given2);
		else if (ope == 2)System.out.println(given1 - given2);
		else if (ope == 3)System.out.println(given1 * given2);
		else if (ope == 4)System.out.println(given1 / given2);
		else System.out.println("Valid Operation");
		
		
		
		
		
		
		
		

	}

}
