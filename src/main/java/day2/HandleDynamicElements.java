
package day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDynamicElements {

 public static void main(String[] args) throws InterruptedException 
 {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  
	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	 Alert e= wait.until(ExpectedConditions.alertIsPresent());
	 Thread.sleep(2000);
	// alert.accept();   
	 
 }

}

