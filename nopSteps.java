package StepDefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import POMPage.NOPCommLocators;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class nopSteps 
{
	public WebDriver driver;
	public NOPCommLocators nl;
	
	@Given("user launch firefox browser")
	public void user_launch_firefox_browser()
	{
	    WebDriverManager.firefoxdriver().browserVersion("124").setup();
	    driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    
	    nl= new NOPCommLocators(driver);
	}

	@When("user opens Url {string}")
	public void user_opens_Url(String Url) throws Exception 
	{
	    driver.get(Url);
	    Thread.sleep(4000);
	}
	
	@When("user clear Email field")
	public void user_clear_Email_field() 
	{
	    nl.clearEmail();
	}

	@When("user enter Email as {string}")
	public void user_enter_Email_as(String email)
	{
		nl.EnterEmail(email);
	}
	
	@When("user clear Password field")
	public void user_clear_Password_field() 
	{
	    nl.clearPwd();
	}

	@When("user enter Password as {string}")
	public void user_enter_Password_as(String pwd)
	{
	    nl.EnterPassword(pwd);
	}

	@When("user click on LogIn button")
	public void user_click_on_LogIn_button() 
	{
	    nl.ClickLogin();
	}

	@When("user scroll down in the home page")
	public void user_scroll_down_in_the_home_page() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0, 1000)");
	}

	@When("user click on Sales button")
	public void user_click_on_Sales_button()
	{
	    nl.ClickSales();
	}

	@When("user click on Order button")
	public void user_click_on_Order_button()
	{
	    nl.ClickOrder();
	}

	@Then("Page url should be {string}")
	public void page_url_should_be(String expUrl) 
	{
		String actUrl= driver.getCurrentUrl();
	   Assert.assertEquals(expUrl, actUrl);
	}


}
