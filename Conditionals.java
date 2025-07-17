package javaFundamentals;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		
		int age;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Age: ");
		age=scan.nextInt();
				
		if(age >= 18) 
			System.out.println("You Have Access, Matanda kana Nigga");
		else if(age >= 13) 
	        System.out.println("You Are Not Qualify To Age Restriction");
		else
			System.out.println("Minor Moments");
		
		
	}
	
}
