package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
private void main() {
	System.setProperty("webdriver.chrome.driver", "E:\\class\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("http://www.newtours.demoaut.com/");
	dr.findElement(By.linkText("REGISTER")).click();
	
	

}
	
	
	
	
}
