package day01;

import java.util.ArrayList;
import java.util.List;


public class Office_1_FibonacciSeriesForAnynumber {
	
	/*
	 * /*
     * Write a method which accepts an integer as parameter
     * and returns “true” if it is a Fibonacci number
     *
     * Then check the result and print
     * “Fibonacci series contain your number” or
     * “Fibonacci series contain that numbers : X and Y”
     /*
	 */
	
     static boolean fibo;
     static int num1;
     static int num2;
     
    	
	public static void main(String[] args) {
		
		int input=250;
		

		checkFibonacci(input);//returns true or false
		
		if (fibo) {
			System.out.println("Fibonaci series contains your number");  
		}else {
			System.out.println("Fibonacci series contaons that number " + num1 + "and" + num2 );
		}
		
	}
	public static void checkFibonacci(int input) {// method accepts int as a parameter
		
		List<Integer> fibonacci= new ArrayList<>();
		//1,2,3,5,8,13
		
		fibonacci.add(0);
		fibonacci.add(1);// why? and why we started from 2 in loop,because i already assigned 0 and 1  here
		
		for(int i=2; i<input; i++) {
			fibonacci.add(fibonacci.get(i-2)+fibonacci.get(i-1));
			
			if (fibonacci.get(i)>=input) {
				break;
			}
						
		}
		
		if (fibonacci.get(fibonacci.size()-1)==input) { //If the last element in list(integer list) equals the input,then it is a fibonacci number
			fibo =true;
		}else {
			fibo=false;
		}
		
		num1=fibonacci.get(fibonacci.size()-1);
		
		num2=fibonacci.get(fibonacci.size()-2);
		
		
		
	}

}
