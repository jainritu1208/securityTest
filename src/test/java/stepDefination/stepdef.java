package stepDefination;

import java.sql.Array;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	public static WebDriver driver;

	@Given("I want to launch websites using {string}")
	public void i_want_to_launch_websites(String url) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Browser enter");
		System.setProperty("webdriver.chrome.driver",
				"E:\\EEWorkspace\\securityBDD\\src\\test\\java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("^^^^"+url);
		driver.get(url);
	}
	@When("Give value to search box {string} {string}")
	public void Give_value_to_search_box(String s1, String s2) {

		String[] str = {s1,s2};
		if(driver.findElements(By.id("SearchByGivenAddress")).size()>0
				||driver.findElements(By.cssSelector("div.locationiq-autocomplete input")).size()>0
				||driver.findElements(By.id("OutletSearch")).size()>0)
		{
			for(int i=0;i<str.length;i++)
			{
				System.out.println("search type enter");
				driver.findElement(By.id("OutletSearch")).sendKeys(str[i]);
				if(driver.findElements(By.cssSelector("div.actions button.btn")).size()>0) {
					System.out.println("type1");
					driver.findElement(By.cssSelector("button.btn")).submit();
				}else if(driver.findElements(By.cssSelector("input[type=submit]")).size()>0) {
					System.out.println("type2");
					driver.findElement(By.cssSelector("input[type=submit]")).submit();
				}
				if(driver.getPageSource().contains("Please try advanced search.") && !driver.getCurrentUrl().contains("search=&") )
				{
					System.out.println("pass ");
				}
				else if(driver.getCurrentUrl().contains("search=&")
						||driver.getPageSource().contains("403 Forbidden")
						||driver.getTitle().equals("Access Denied")
						||driver.getPageSource().contains(str[i])) {
					System.out.println("Fail");
				}
				else  {
					System.out.println("pass ");				
				}	
			}
		}
	}
	
	
	@Then("close browser {string}")
	public void close_browser(String se1) {
		// Write code here that turns the phrase above into concrete actions
		String[] str1 = {se1};
		for(int i=0;i<str1.length;i++)
		{
		System.out.println(str1[i]);
		}
		
		driver.close();
	}

}
