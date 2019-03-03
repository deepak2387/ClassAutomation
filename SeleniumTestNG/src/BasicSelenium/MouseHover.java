package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\class\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver dr = new ChromeDriver();
		 dr.manage().window().maximize();
		 dr.get("https://flipkart.com/");
		 dr.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		 WebElement ele = dr.findElement(By.xpath("//span[text()='Men']"));
		 
		 Actions act = new Actions(dr);
		 //action class is used for mouse hover
		 act.moveToElement(ele).build().perform();
		 WebDriverWait wait = new WebDriverWait(dr,2);
		 wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[@title='Shirts']")))); //explicict wait
		 //Thread.sleep(2000);--------thread sleep
		 //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);----implicit wait
			 dr.findElement(By.xpath("//a[@title='Shirts']")).click();
			 Thread.sleep(5000);
			// wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//div[@class='_3aQU3C'][1]"))));
		 act.dragAndDropBy(dr.findElement(By.xpath("//div[@class='_3aQU3C'][1]")),50, 0).build().perform();
		 Thread.sleep(5000);
		 //wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//div[@class='_3aQU3C'][2]"))));
		 act.dragAndDropBy(dr.findElement(By.xpath("//div[@class='_3aQU3C'][2]")),-50, 0).build().perform();
		 
		 
		 
		 
	}
}
