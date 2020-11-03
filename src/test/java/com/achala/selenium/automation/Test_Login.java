package com.achala.selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Login {
	
	
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		System.out.println("Hi This Is First Maven Result");
	}

}
