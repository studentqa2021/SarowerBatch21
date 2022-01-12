package com.smoke.test;

public class Practice {
	static String strReverse = "";

	public static boolean getLogin() {
		String chString = "MOM";

		for (int a = chString.length() - 1; a >= 0; a--) {
			strReverse = strReverse + chString.charAt(a);
		}
		// printing given string and reversed string
		System.out.println(strReverse);
		// check if given string is palindrome
		if (chString.equals(strReverse)) {

			return true;
		} else {
			System.out.println("string is not palindrome.");

			return false;
		}
	}

	public Practice getSearchProduct() {
		System.out.println("Search");
		return this;
	}

	public Practice addToCart() {
		System.out.println("Cart");
		return this;
	}

	public Practice payment() {
		System.out.println("Payment");
		return this;
	}

}
