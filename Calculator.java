package javaFundamentals;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		float ge4;
		float ge3;
		float ge2;
		float ge1;
		String name;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your Name: ");
		name = scan.nextLine();
		
		System.out.print("Enter your grade in Computer programming: ");
		ge4 = scan.nextFloat();
		
		System.out.print("Enter your grade in Introducing to Computing: ");
		ge3 = scan.nextFloat();
		
		System.out.print("Enter your grade in Pathfit: ");
		ge2 = scan.nextFloat();
		
		System.out.print("Enter your grade in Understanding Your Self: ");
		ge1 = scan.nextFloat();
		
		System.out.println("Your Grade in Computer programming     : " + ge4);
		System.out.println("Your Grade in Introducing to Computing : " + ge3);
		System.out.println("Your Grade in Pathfit                  : " + ge2);
		System.out.println("Your Grade in Understanding Your Self  : " + ge1);
		
		float ave = (ge1 + ge2 + ge3 + ge4) /4;
		
		System.out.println("Your Average is: " + ave);
		
		if (ave >= 98)System.out.println("Youre With Highest Honor Congrats" + name);
		else if (ave >= 95)System.out.println("Youre With High Honor Congrats" + name);
		else if (ave >= 90)System.out.println("Youre with Honor Congrats" + name);
		else if (ave >= 75)System.out.println("Youre Passed Congrats" + name);
		else System.out.println("Youre Failed, Try Again");
		
		
	}

}
