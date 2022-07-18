package recursion;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		int c=n*factorial(n-1);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		System.out.println(factorial(x));
	}
}
