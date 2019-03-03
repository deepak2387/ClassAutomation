package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyTest00 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\class\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("http://www.newtours.demoaut.com/");
	dr.findElement(By.linkText("REGISTER")).click();
	dr.findElement(By.name("firstName")).sendKeys("Deepak");
	dr.findElement(By.name("lastName")).sendKeys("Wankhede");
	dr.findElement(By.name("phone")).sendKeys("9960873940");
	dr.findElement(By.name("userName")).sendKeys("deepak2387@gmail.com");
	dr.findElement(By.name("address1")).sendKeys("Krishna Icon");
	dr.findElement(By.name("address2")).sendKeys("Alandi");
	dr.findElement(By.name("city")).sendKeys("Alandi Devachi");
	dr.findElement(By.name("address1")).sendKeys("Krishna Icon");
	dr.findElement(By.name("state")).sendKeys("Maharashtra");
	dr.findElement(By.name("postalCode")).sendKeys("412105");
	WebElement ele = dr.findElement(By.xpath("//select[@name='country']"));
	  Select sel = new Select(ele);
	  sel.selectByVisibleText("INDIA");
	  dr.findElement(By.name("email")).sendKeys("data");
	  dr.findElement(By.name("password")).sendKeys("data");
	  dr.findElement(By.name("confirmPassword")).sendKeys("data");
	  dr.findElement(By.name("register")).click();
	  
	  
	
	
	

}
	
	
	
	
}
