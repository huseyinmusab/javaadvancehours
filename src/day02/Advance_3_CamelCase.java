package day02;

import java.util.Scanner;

public class Advance_3_CamelCase {
	
	/* Write a return method that accepts a sentence as parameter
     * Then converts it to Camelcase
     * (without any space or specialCharacter)
     *
     * Input  : I am writing code easily
     * Output : IAmWritingCodeEasilyItIsGreat
     * Hint: append() 
     */

	public static void main(String[] args) {
		

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the sentence");
		String input= scan.nextLine();
		
		camelCase(input);
		
		scan.close();
		
		
	}
	public static void camelCase(String input) {
		String[] words = input.split(" ");
		
		String output="";
		
		for (int i = 0; i < words.length; i++) {
			
			String word=words[i].replaceAll("[^a-zA-Z]", "");
			
			System.out.println(word);
			
			output+=word.substring(0,1).toUpperCase()+
					word.substring(1).toLowerCase();
		}
		System.out.println("Output: " +output);
		
		//Stringbuilder ile de cozulur
	}

}
