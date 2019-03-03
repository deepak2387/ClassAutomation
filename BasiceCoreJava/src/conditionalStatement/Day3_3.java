package conditionalStatement;

public class Day3_3 {

	public static void main(String[] args) {
		int a=10;
		int b=45;
		int c=30;
		if(a>b && b>c){
			System.out.println("a is smallest");
		}else if(b>a && b>c){
			System.out.println("b is greatest");
		}else if(c>a && c>b){
			System.out.println("c is greatest");
		}

	}

}
