package recursion;

import java.util.Scanner;

public class Pdiskip {
public static void pdiscip(int n)
{
	if(n==0)
	{
		return;
	}
	if(n%2==1)
	{
		System.out.println(n);
	}
	pdiscip(n-1);
	if(n%2==0)
	{
		System.out.println(n);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		pdiscip(x);
	}

}
