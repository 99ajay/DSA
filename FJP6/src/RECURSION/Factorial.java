package RECURSION;

import java.util.Scanner;

public class Factorial {
public static int factorial(int n)
{
	if(n<=1)
	{
		return 1;
	}
	int factnum=factorial(n-1);
	int fact=n*factnum;
	return fact;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		    int n=scn.nextInt();
		    System.out.println(factorial(n));
	}

}
