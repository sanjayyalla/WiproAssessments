//A) Write a program to check if a given integer number is Positive, Negative, or Zero.

import java.util.Scanner;

public class FirstA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		if(a<0) System.out.println("Negative");
		else if(a>0) System.out.println("Positive");
		else System.out.println("Zero");
		

	}

}
