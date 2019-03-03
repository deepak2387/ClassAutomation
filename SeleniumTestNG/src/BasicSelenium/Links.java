package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\class\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver dr = new ChromeDriver();
		 dr.manage().window().maximize();
		 dr.get("http://www.newtours.demoaut.com/");

		// dr.findElement(By.linkText("REGISTER")).click();
		 dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 dr.findElement(By.partialLinkText("GISTER")).click();
		 
		 
	}

}
