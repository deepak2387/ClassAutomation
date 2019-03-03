package BasicSelenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\class\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver dr = new ChromeDriver();
		 dr.manage().window().maximize();
		 dr.get("https://www.naukri.com");
		 //dr.close();
//dr.quit();
		 String parent =dr.getWindowHandle();
		 //System.out.println(parent);
Set<String> wins=dr.getWindowHandles();	//set is used as the windows are always unique.
for(String s:wins){
	System.out.println(s);
	dr.switchTo().window(s);
	if(!s.equals(parent)){
		dr.close();
	}
}





	}

}
