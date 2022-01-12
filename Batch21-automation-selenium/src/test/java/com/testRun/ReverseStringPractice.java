package com.testRun;

public class ReverseStringPractice {
// find how many a in United State of America
	
	public void getReverse(String country) {
		int count=0;
		for (int i = 0; i<country.length(); i++) {
			if(country.charAt(i)=='e') {
				count++;
			}
					}
		System.out.println("e total count = "+count);
	}

	public static void main(String[] args) {
		ReverseStringPractice obj = new ReverseStringPractice();
		obj.getReverse("United State of America");
	}

}
