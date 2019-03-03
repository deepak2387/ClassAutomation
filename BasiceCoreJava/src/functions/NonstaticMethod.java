package functions;

public class NonstaticMethod {

	public static void main(String[] args) {
	NonstaticMethod obj=new NonstaticMethod();
	obj.sum(10,20);
	
	}
	public int sum(int a,int b)
	{
		return a+b;
		
	}

}
