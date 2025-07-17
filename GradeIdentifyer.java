package javaFundamentals;

import java.util.Scanner;

public class GradeIdentifyer {

	public static void main(String[] args) {
		
		int english;
		int science;
		int filipino;
		int math;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter Your Grade in English: ");
		english = scan.nextInt();
		
		System.out.println("Enter Your Grade in Science: ");
		science = scan.nextInt();
		
		System.out.println("Enter Your Grade in Math: ");
		math = scan.nextInt();
		
		
		System.out.println("Enter Your Grade in Filipino: ");
		filipino = scan.nextInt();
		
		System.out.println("English : " + english);
		System.out.println("Science : " + science);
		System.out.println("Filipino: " + filipino);
		System.out.println("Math    : " + math);
		
		float average =(english + science + filipino + math) /4;
		
		System.out.println("Your Average is: " + average);
		
		if(average >= 96)
			System.out.println("You're With Highest Honors");
		else if(average >= 90)
		    System.out.println("You're With Honors Honors");
		else if(average >= 75)
			System.out.println("You're Passes");
		else 
			System.out.println("You,re Failed");
		
		}

}
