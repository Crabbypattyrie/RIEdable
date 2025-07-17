package javaFundamentals;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		String user[] = {"Patrick", "Jeru", "Yuan"};
		String email[] = {"@Patrick.com", "@Jeru.com", "@Yuan.com"};
		String Pass[] = {"patpat", "jerays", "Yuaans"};
		
		Scanner scan = new Scanner(System.in);
		
		int p;
		
		System.out.print("Enter the User number: ");
		p=scan.nextInt();
		
		System.out.println("Usename  : "+ user[p]);
		System.out.println("Email    : "+ email[p]);
		System.out.println("Password : "+ Pass[p]);
		

	}

}
