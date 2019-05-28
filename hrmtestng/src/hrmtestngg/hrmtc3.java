package hrmtestngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class hrmtc3  extends  hrmtc2{
	  //WebDriver dr;
	WebElement es;
	WebElement etd;
	WebDriverWait wait;
	WebElement ee;
@Test
public void edithrm() throws InterruptedException{
	Thread.sleep(3000);
	/*dr.switchTo().defaultContent();
	dr.switchTo().frame("rightMenu");*/
	System.out.println("saiii");
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Edit']")));
	Thread.sleep(3000);
	ee=dr.findElement(By.xpath("//input[@value='Edit']"));
	ee.click();
	//Thread.sleep(3000);
	es=dr.findElement(By.xpath("//input[@id='txtJobTitleName']"));
	es.clear();es.click();es.sendKeys("martha anj");
	etd=dr.findElement(By.xpath("//textarea[@name='txtJobTitleDesc']"));
	etd.clear();etd.click();etd.sendKeys("i  hava been working as software  testengeener in quotech company");
	Thread.sleep(3000);
	dr.findElement(By.xpath("//input[@id='editBtn']")).click();
}
}
