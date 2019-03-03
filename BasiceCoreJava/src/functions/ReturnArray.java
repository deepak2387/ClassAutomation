package functions;

public class ReturnArray {

	public static void main(String[] args) {
		String[][] str1=test();
		for(int r=0;r<str1.length;r++){
			for(int c=0;c<str1[r].length;c++)
			{
				System.out.println(str1[r][c]);
			}
		}

	}
public static String[][] test()
{
	String[][] str= {{"U1","P1","A1"},{"U2","P2","A2"},{"U3","P3","A3"}};
	return str;
	
	
}
public static ReturnArray test2()
{
	return new ReturnArray();
}
public static String test3()
{
	return "test message";
}

public static int sum(int a,int b)
{
	return a+b;
}




}

