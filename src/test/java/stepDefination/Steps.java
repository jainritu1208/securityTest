package stepDefination;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;


import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.*;
//	import cucumber.api.DataTable;
//	import cucumber.api.java.en.Given;
//	import cucumber.api.java.en.Then;

public class Steps {
	public static WebDriver driver;
	String url = "https://www.facebook.com";

//	@Before
//	public void launchBrowser()
//	{
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\EEWorkspace\\securityBDD\\src\\test\\java\\driver\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//
//	}

	@Given("I want to open browser test")
	public void i_want_to_open_browser() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("given enter");
		System.setProperty("webdriver.chrome.driver",
				"E:\\EEWorkspace\\securityBDD\\src\\test\\java\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}


	@When("User want to pass url")
	public void User_want_to_pass_url() {
		System.out.println("When enter");
		driver.get(url);
	}

	@Then("user get Title of url")
	public void user_get_Title_of_url() {
		System.out.println("************"+driver.getTitle());
	}	
}