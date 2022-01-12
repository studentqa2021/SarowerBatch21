package com.testRun;

public class InterviewCoding {// 100==>100%
	// a=2,b=6 , swap the value(a=10,b=5)

	public void getSwapValue(int a, int b) {// parameter
		System.out.println("A value before swap = " + a);
		System.out.println("B value before swap = " + b);
		// code
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("A value after swap = " + a);
		System.out.println("B value after swap = " + b);

	}

	public static void main(String[] args) {
		InterviewCoding obj = new InterviewCoding();
		obj.getSwapValue(20, 60);//argument
	}

}
