package com.testRun;

import java.util.Arrays;

public class JavaCollectionPractice {
	// a=10, b=20; swap the value
	
	
	public void getSwap(int a,int b) {
		//code
		System.out.println("A value before swap = "+a);
		System.out.println("B value before swap = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A value after swap = "+a);
		System.out.println("B value after swap = "+b);
		
	}
	
	public static void main(String[] args) {
		JavaCollectionPractice obj = new JavaCollectionPractice();
		
		obj.getSwap(10,20);
	}


}
