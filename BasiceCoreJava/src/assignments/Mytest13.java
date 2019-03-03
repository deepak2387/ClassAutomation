package assignments;

public class Mytest13 {

	public static void main(String[] args) {
		TestMethod();
		//Sum(10,20);
		int total = Sum(10,20)*5;
		int result =total*45;
		System.out.println(result);

	}
	
	public static void TestMethod(){
		System.out.println("written a method");
	}
public static int Sum (int a,int b){
	//System.out.println(a+b);
	return (a+b);
	
}
}
