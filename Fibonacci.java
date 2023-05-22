package cen4802;

import java.util.Scanner;

public class Fibonacci {
	 /**
     * Calculates the nth term in the Fibonacci sequence using recursion.
     *
     * @param n the position of the term in the Fibonacci sequence to calculate
     * @return the nth term 
     */
	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        
	        // Calculate the nth term by using the previous terms
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    // Main method for Fibonacci sequence
	    public static void main(String[] args) {
	        // Create a Scanner object 
	        Scanner scanner = new Scanner(System.in);
	        // Enter N value
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        // Close the Scanner 
	        scanner.close();

	        // Calculate the nth term 
	        int nthTerm = fibonacci(n);

	        // Output
	        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
	    }
	}