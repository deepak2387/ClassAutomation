package exceptions;

public class ThrowsException {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		if(a==b)
		{
			System.out.println("no matched");
		}else 
		{
			throw new RuntimeException("no not matched a="+a+" and b="+b );
		}
		

	}

}
