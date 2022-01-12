package com.generic.code;

public class BaseLogin {

	static String name;//null==> nullPointerException


	public BaseLogin(String name) {//parameter

		this.name=name;
		
	}

	
	public void getLogin() {
		// code

		System.out.println(name);
		

	}

}// end class
