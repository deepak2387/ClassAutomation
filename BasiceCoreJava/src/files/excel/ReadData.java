package files.excel;

import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		Xls_Reader xl = new Xls_Reader("E:\\class\\Login.xls");
		
		String str1= xl.getCellData("Sheet1", 1, 1);
		System.out.println(str1);
		
	}

}
