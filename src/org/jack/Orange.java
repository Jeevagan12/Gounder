package org.jack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orange {

	public static void main(String[] args) {
		 System.setProperty("webdriver.driver.chromedriver","C:\\User\\eclipse-workspace\\Popup\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  driver.get("http://greenstech.in/selenium-course-content.html");
		 driver.manage().window().maximize();
		 
		
		
	WebElement ele = driver.findElement(By.xpath("(//h2[@class='mb-0'])[7]"));
	ele.click();
   
	 Actions a = new Actions(driver);
	 a.moveToElement(ele).perform();
	 WebElement ele2 = driver.findElement(By.xpath("//a[text()=' TESTNG']"));
	 ele2.click();
	
			 
	     
	      
		 String parent = driver.getWindowHandle();
		 System.out.println(parent);
		 
		
		 Set<String> allwindow = driver.getWindowHandles();
		 System.out.println(allwindow);
		 
		 String currenturl = driver.getCurrentUrl();
		 System.out.println(currenturl);
		 
		 for(String s:allwindow) {
			 if(parent.equals(allwindow));
			 driver.switchTo().window(s);
				 
		 }
		 String currenturl1 = driver.getCurrentUrl();
		 System.out.println(currenturl1);
	WebElement tp	= driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
	String text = tp.getText();
	
		 System.out.println(text);

	}

}