package day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Task:1  

public class DatePicker {

   public static void main(String[] args) {
	   
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	        driver.findElement(By.xpath("//td//a[contains(text(),'25')]")).click();
	        
	        



   }

}