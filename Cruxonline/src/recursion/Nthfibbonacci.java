package recursion;

import java.util.Scanner;

public class Nthfibbonacci {
public static int fibbonacci(int n)
{
	if(n==0 || n==1)
	{
		return n;
	}
	int x=fibbonacci(n-1)+fibbonacci(n-2);
	return x;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		System.out.println(fibbonacci(x));
	}

}
