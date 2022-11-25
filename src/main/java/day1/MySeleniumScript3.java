package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MySeleniumScript3 {

	public static void main(String[] args)throws Exception {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/signup");
//		 Thread.sleep(5000);
//		 WebElement username=driver.findElement(By.name("state"));
//		 WebElement stateDropdown=driver.findElement(By.id("state"));
//		 Select state=new Select(stateDropdown);
//		 
//		 state.selectByIndex(2);
//		 Thread.sleep(2000);
//		 state.selectByVisibleText("Goa");
//		 Thread.sleep(2000);
//		 state.selectByValue("Karnataka");
//		 List<WebElement> allValues=state.getOptions();
//		 
//		 for(WebElement ele:allValues)
//		 {
//			 System.out.println(ele.getText());
//		 }
//		 driver.findElement(By.xpath("")).click();
//		 
//		 driver.findElement(By.linkText("New user? Signup")).click();
//		 }
		 
		 WebElement username=driver.findElement(By.name("name"));
		 
		 username.sendKeys("SapientTraining@gmail.com");
		 
		 driver.findElement(By.id("password1")).sendKeys("Abcd@1234");
		 
		 driver.findElement(By.className("submit-btn")).click();
		 
		 
		 
		 
	}
}

