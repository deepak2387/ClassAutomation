package files.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args){
		
		
		/*Properties or =new Properties();
		FileInputStream file=new FileInputStream("D:\\Automation_Repo\\workspace\\BasiceCoreJava\\src\\files\\properties\\ObjectRepository.properties");
		or.load(file);
//Thread.sleep(5000);
		System.out.println(or.getProperty("username"));
	}
*/
		
		
		
	}
	
	public static void fun1() throws IOException
	{

		Properties or =new Properties();
		FileInputStream file=new FileInputStream("D:\\Automation_Repo\\workspace\\BasiceCoreJava\\src\\files\\properties\\ObjectRepository.properties");
		or.load(file);
//Thread.sleep(5000);
		System.out.println(or.getProperty("username"));	
	}
	
	
}
