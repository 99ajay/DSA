package RECURSION;

import java.util.Scanner;

public class Pincreasing {
public static void printincreasing(int n)
{
	if(n==0)
	{
		return;
	}
	printincreasing(n-1);
	System.out.println(n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    printincreasing(n);
	}

}
