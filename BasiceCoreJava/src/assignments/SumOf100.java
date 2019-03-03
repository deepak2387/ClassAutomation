package assignments;

public class SumOf100 {

	public static void main(String[] args) {

        int total = 0;

        for(int i = 1; i <= 100; ++i)
        {
           
            total = total+i;
        }

        System.out.println("Sum = " + total);
    }

}
