
/**
 * @(#)Fibonacci.java
 *
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

	// 20th Fibonacci number is 6765
	public static long computeFibonacci(long x) {
		if (x < 0)
			throw new IllegalArgumentException("Bad input: " + x);
		if (x <= 1) {
			return x;
		} else {
			return computeFibonacci(x - 2) + computeFibonacci(x - 1);
		}
	}

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.print("Which fibonacci number would you like to find? --> ");
				Scanner kboard = new Scanner(System.in);
				int x = kboard.nextInt();
				if (x == -1)
					System.exit(0);
				else {
					long answer = computeFibonacci(x);
					System.out.println("The " + x + " fibonacci number is " + answer + ".");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Type in an int!!!");
			} catch (IllegalArgumentException ex) {
				System.err.println("No Negative!!!!");
			} catch (StackOverflowError ex) {
				System.err.println("\n" + "Stack Overflow- too big");
			}
		}
	}
}
