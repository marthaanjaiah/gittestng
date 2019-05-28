package hrmtestngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hrmtc1 {
	  WebDriver dr;
	WebDriverWait wait;
	WebElement un;
	WebElement up;
	
@BeforeTest
public void openbro(){
	System.setProperty("webdriver.chrome.driver","D:\\seleniumjars\\chromedriver.exe");
	dr=new ChromeDriver();
	System.out.println("a");
}
@Test
public void loginhrm(){
	dr.get("http://apps.qaplanet.in/qahrm/login.php");
	if(dr.getTitle().equals("OrangeHRM - New Level of HR Management")){
		System.out.println("webpage displayed");
	}
	wait=new WebDriverWait(dr,60);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
	un=dr.findElement(By.name("txtUserName"));
	un.clear();un.click();un.sendKeys("qaplanet1");
	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
	up=dr.findElement(By.xpath("//input[@name='txtPassword']"));
	up.click();up.sendKeys("lab1");
	dr.findElement(By.name("Submit")).click();
}

/*@AfterMethod
public void closebro(){
	dr.close();dr.quit();
}*/
}
