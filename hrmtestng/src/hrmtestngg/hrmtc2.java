package hrmtestngg;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public  class hrmtc2 extends hrmtc1 {
	Actions a;
	WebElement ea;
	WebElement ej;
	WebElement et;
	WebElement eadd;
	WebElement eeu;
	WebElement ee;
	@Test
	public void Admin(){
		a=new Actions(dr);
		ea=dr.findElement(By.xpath("//span[contains(text(),'Admin')]"));
		a.moveToElement(ea).perform();
		//Select s=new Select(ea);
		/*WebElement el=dr.findElement(By.xpath("//ul[@class='l2']/li"));
		List<WebElement> ell=el.getText();
		
		Iterator<WebElement> i=ell.iterator();
		while(i.hasNext()){
			System.out.println(i.next().getText());
		}*/
		
		ej=dr.findElement(By.xpath("//span[contains(text(),'Job')]"));
		a.moveToElement(ej).perform();
		et=dr.findElement(By.xpath("//span[contains(text(),'Job Titles')]"));
		a.moveToElement(et).perform();
		et.click();
		}
	@Test 
	public void aDD(){
		dr.switchTo().frame("rightMenu");
		eadd=dr.findElement(By.xpath("//input[@value='Add']"));
		eadd.click();
		
	}
	@Test
	public void enterdetails() throws InterruptedException{
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txtJobTitleName']")));
		dr.findElement(By.xpath("//input[@id='txtJobTitleName']")).sendKeys("anj");
		//Thread.sleep(3000);
		System.out.println("sai");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@name='txtJobTitleDesc']")));
		dr.findElement(By.xpath("//textarea[@name='txtJobTitleDesc']")).sendKeys("enter job detyails of the project");
		dr.findElement(By.xpath("//input[@value='Save']")).click();
		
	}
	

}
