package day01;

import java.util.ArrayList;
import java.util.List;

public class Office_2_FindPrimeNumbers {


	/*
     * Write a program that accepts an integer as input and prints first 10 prime
     * numbers greater than input
     *
     * Check numbers if they are even or not in a return method
     *
     *	Prime Numbers: 2 3 5 7 11...
     */
	
	
	public static void main(String[] args) {
		

		int input =5;
		int count =0;
		
		List<Integer>first10Primes= new ArrayList<>();
		
		while (count<10) {
			input++;
			
			if (isPrime(input)) {
				count++;
				first10Primes.add(input);
			}
						
		}
		System.out.println(first10Primes);
		
		
	}
	
	public static boolean isPrime(int num) {
		
		if (num!=2) {
			
			for (int i = 2; i<num; i++) {
				if (num%i==0) {//means prime numbers are not been divided
					
					return false;
				}
			}
		}
		
		return true;
		
		
		
	}
	

}
