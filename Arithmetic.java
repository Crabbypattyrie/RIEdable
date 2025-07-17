package javaFundamentals;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		int given1;
		int given2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		given1=scan.nextInt();
		
		System.out.print("Enter Second Number: ");
		given2=scan.nextInt();
		
		System.out.println(given1 * given2);
		

	}

}
