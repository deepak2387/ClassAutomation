package reflection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import files.excel.Xls_Reader;

public class Executor {

	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {

		Xls_Reader xl = new Xls_Reader("E:\\class\\Login.xls");
		
		String tcname= xl.getCellData("Keywords", 2, "TC_Name");
		System.out.println(tcname);
		String[] Keywords= xl.getCellData("Keywords", 2, "Keywords").split(",");
		System.out.println(Keywords);
		Class c=Class.forName("reflection."+tcname);
		Object obj = c.newInstance();
		Method m = c.getDeclaredMethod(Keywords[1]);
		m.invoke(obj);
		
	}
	//using reflection we can create runtime object of any class


}
