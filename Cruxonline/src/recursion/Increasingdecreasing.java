package recursion;

import java.util.Scanner;

public class Increasingdecreasing {
public static void increasingdecreasing(int n)
{
	if(n==0)
	{
		return;
	}
	System.out.println(n);
	increasingdecreasing(n-1);
	System.out.println(n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		increasingdecreasing(x);
	}

}
