package com.smoke.test;

public class TestRun {
	int num = 3553, reversedNum = 0, remainder;

	public static boolean isPalindrome(int number) {
		int a = number; // copied number into variable
		int reverse = 0;

		while (a != 0) {
			int remainder = a % 10;
			System.out.println(remainder);
			reverse = reverse * 10 + remainder;
			System.out.println(reverse);
			a = a / 10;
			//System.out.println(a);
		}
		//System.out.println(reverse);
		// if original and the reverse of number is equal means
		// number is palindrome in Java
		if (number == reverse) {
			return true;
		} else {
			return false;
		}
	}
	 public static void reverseMethod(int number) {
	       if (number < 10) {
		   System.out.println(number);
		   return;
	       }
	       else {
	           System.out.print(number % 10);
	           //Method is calling itself: recursion
	           reverseMethod(number/10);
	       }
	   }
	public static void main(String[] args) {
		reverseMethod(6);
	}
}