package conditionalStatement;

public class Day3_2 {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	if(a>b){
		if(b>c){
			System.out.println("a is greatest");
		}else if(a>c) {
			System.out.println("a is not greatest");
		}
	}

	}

}
