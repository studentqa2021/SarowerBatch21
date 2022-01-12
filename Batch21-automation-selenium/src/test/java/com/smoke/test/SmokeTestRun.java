package com.smoke.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testRun.JavaCollectionPractice;

public class SmokeTestRun {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // driver path

		WebDriver driver = new ChromeDriver();// Yes == up casting
		driver.get("https://www.cvs.com/");


	}

}
