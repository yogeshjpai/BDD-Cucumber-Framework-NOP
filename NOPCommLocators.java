package POMPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NOPCommLocators 
{
	public WebDriver wd;
	
	public NOPCommLocators(WebDriver d)
	{
		wd= d;
	}
	
	By ClrEmail = By.xpath("//input[@id='Email']");
	By Emailtxt= By.id("Email");
	By clrPass = By.xpath("//input[@id='Password']");
	By pwdTxt= By.id("Password");
	By loginBtn= By.xpath("//button[text()='Log in']");
	By salesBtn= By.xpath("//li[@class='nav-item has-treeview']//child::a[@class='nav-link']//child::i[@class='nav-icon fas fa-shopping-cart']");
	By orderBtn= By.xpath("//div[@class='os-content']//child::a//i[@class='nav-icon fas fa-desktop']");
	
	public void clearEmail()
	{
		wd.findElement(ClrEmail).clear();
	}
	
	public void EnterEmail(String email)
	{
		wd.findElement(Emailtxt).sendKeys(email);
		
	}
	
	public void clearPwd()
	{
		wd.findElement(clrPass).clear();
	}
	
	public void EnterPassword(String pass)
	{
		wd.findElement(pwdTxt).sendKeys(pass);
	}
	
	public void ClickLogin()
	{
		wd.findElement(loginBtn).click();
	}
	
	public void ClickSales()
	{
		wd.findElement(salesBtn).click();
	}
	
	public void ClickOrder()
	{
		wd.findElement(orderBtn).click();
	}

}
