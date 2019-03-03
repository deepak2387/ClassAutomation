package exceptions;

import java.util.Hashtable;

public class TryCatch {

	public static void main(String[] args) {
		
		
		try
		{
			//arithmatic exception
			int a= 10;
			int b= 5;
			System.out.println(a/b);
			//nullpointer exception
			Hashtable<String,String> table =new Hashtable<String,String>();
			//table.put(null, "anand");
			//System.out.println(table.get(null));
			//StringIndexOutOfBound
			String str="a";
			System.out.println(str.charAt(1));
			Thread.sleep(5000);
			
		}catch(ArithmeticException e)
		{
			System.out.println("fail:divident is zero ");
		}
		catch(NullPointerException n)
		{
			System.out.println("fail:user has passed null key in hashtable ");
		}
		catch(RuntimeException n)
		{
			System.out.println("fail:user has passed null key in hashtable ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("Deepak");
	}
	
}
