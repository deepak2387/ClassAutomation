package loops;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70};
		
		/*for(int i=0; i<arr.length;i++)---normal for loop
	System.out.println(arr[i]);*/
for(int i:arr) //advaced for loop
{
	System.out.println(i);
}
	}
	

}
