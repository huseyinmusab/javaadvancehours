package day02;

import java.util.Scanner;

public class Advance_1_RightTrianglePattern {
	
	/*
	 *  Create Right Triangle pattern 
	 
     * Example: Enter a number 
		Input: 5
		
		 *        ==> first row
		 * *      ==> second row
		 * * * 
		 * * * * 
		 * * * * *
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		
		rightTriangle(n);

		scan.close();
	}
	public static void rightTriangle(int n) {
		
		//Gives rows
		for (int i = 0; i <=n; i++) {
			//Gives *
			for (int j = 0; j < i; j++) {

				System.out.print("* ");
				}
				
			System.out.println(); //we pass to next row here

			}
			
			
		}
		
	}
	


