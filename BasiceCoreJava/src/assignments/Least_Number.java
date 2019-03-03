package assignments;
import java.util.Scanner;

public class Least_Number {

	public static void main(String[] args) {
	
	Scanner x = new Scanner(System.in);
	System.out.print("Enter number of elements in the array:");
	
		int n,min;
		n=x.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of array");
		for (int i=0;i<n;i++){
			a[i]=x.nextInt();
			
		}
		min=a[0];
		for (int i=0;i<n;i++){
			if(min>a[i]){
				min=a[i];
			}
			
		}System.out.println("least number is " +min);
	}

}
