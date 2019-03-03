package arrays;

public class Day3_5 {

	public static void main(String[] args) {
		String[][] str = new String[2][4];
		
//row 1
		str[0][0]="abc";
		str[0][1]="dinde";
		str[0][2]="ptc";
		str[0][3]="pune";
//row 2
		str[1][0]="pqr";
		str[1][1]="dinde";
		str[1][2]="ptc";
		str[1][3]="pune";
		System.out.println(str[0][1]);
		System.out.println(str.length);
		for(int i=0; i<str.length; i++)
		{
			for(int c=0;c<str[i].length;c++)
			{
				System.out.println(str[i][c]);
			}
		}
	}
	

}
