package RECURSION;

import java.util.Scanner;

public class Pd {
	public static void printdecreasing(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printdecreasing(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		    int n=scn.nextInt();
		    printdecreasing(n);
	}

}
