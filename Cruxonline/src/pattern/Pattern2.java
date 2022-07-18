package pattern;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		while(row<=n)
		{
			int col=1;
			while(col<=n)
			{
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
