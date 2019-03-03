package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\class\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("C:/Users/dwankhede/Downloads/Practice.html");
		Select sel = new Select(dr.findElement(By.id("anand")));
	sel.selectByIndex(1);
	sel.selectByIndex(2);
	sel.selectByIndex(3);
	//sel.deselectAll();
JavascriptExecutor js = (JavascriptExecutor) dr;//typecasting
WebElement ele = dr.findElement(By.tagName("button"));
js.executeScript("arguments[0].scrollIntoView();",ele);
ele.click();
Alert al = dr.switchTo().alert();
String str = al.getText();
System.out.println(str);
//al.accept();
al.dismiss();
Thread.sleep(2000);
dr.close();

	}
	

}
