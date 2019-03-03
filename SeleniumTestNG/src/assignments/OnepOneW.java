package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnepOneW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\class\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		 dr.findElement(By.name("userName")).sendKeys("mercury");
		 dr.findElement(By.name("password")).sendKeys("mercury");
		 dr.findElement(By.name("login")).click();
		 String str=dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText();
		 System.out.println(str);
		 dr.findElement(By.xpath("//input[@value='oneway']")).click();
		 boolean b =dr.findElement(By.xpath("//input[@value='oneway']")).isSelected();
		  System.out.println(b);
		  //Select sel = new Select(dr.findElement(By.xpath("//input[@name='passCount']")));
		  WebElement ele = dr.findElement(By.xpath("//select[@name='passCount']"));
		  Select sel = new Select(ele);
		  sel.selectByVisibleText("1");
		  WebElement ele1 = dr.findElement(By.xpath("//select[@name='fromPort']"));
		  Select sel1 = new Select(ele1);
		  sel1.selectByVisibleText("London");
		  WebElement ele2 = dr.findElement(By.xpath("//select[@name='fromMonth']"));
		  Select sel2 = new Select(ele2);
		  sel2.selectByVisibleText("March");
		  WebElement ele3 = dr.findElement(By.xpath("//select[@name='fromDay']"));
		  Select sel3 = new Select(ele3);
		  sel3.selectByVisibleText("4");
		  WebElement ele4 = dr.findElement(By.xpath("//select[@name='toPort']"));
		  Select sel4 = new Select(ele4);
		  sel4.selectByVisibleText("Paris");
		  WebElement ele5 = dr.findElement(By.xpath("//select[@name='toMonth']"));
		  Select sel5 = new Select(ele5);
		  sel5.selectByVisibleText("March");
		  WebElement ele6 = dr.findElement(By.xpath("//select[@name='toDay']"));
		  Select sel6 = new Select(ele6);
		  sel6.selectByVisibleText("6");
		  dr.findElement(By.xpath("//input[@value='First']")).click();
		  WebElement ele7 = dr.findElement(By.xpath("//select[@name='airline']"));
		  Select sel7 = new Select(ele7);
		  sel7.selectByVisibleText("Blue Skies Airlines");
		  dr.findElement(By.name("findFlights")).click();
		  dr.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
		  dr.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
		  dr.findElement(By.name("reserveFlights")).click();
		  dr.findElement(By.name("passFirst0")).sendKeys("Deepak");
		  dr.findElement(By.name("passLast0")).sendKeys("Wankhede");
		  WebElement ele8 = dr.findElement(By.xpath("//select[@name='pass.0.meal']"));
		  Select sel8 = new Select(ele8);
		  sel8.selectByVisibleText("Hindu");
		  WebElement ele9 = dr.findElement(By.xpath("//select[@name='creditCard']"));
		  Select sel9 = new Select(ele9);
		  sel9.selectByVisibleText("Visa");
		  dr.findElement(By.name("creditnumber")).sendKeys("123456789");
		  
		  
	}

}
