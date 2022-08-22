package RECURSION;

import java.util.Scanner;

public class Max {
	public static int maxarray(int arr[],int idx)
	{
		if(idx==arr.length)
		{
			return Integer.MIN_VALUE;
		}
		
		int x=Math.max(arr[idx],maxarray(arr,idx+1));
		return x;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner scn=new Scanner(System.in);
			    int n=scn.nextInt();
			    int arr[]=new int[n];
			    for(int i=0;i<n;i++)
			    {
			    	arr[i]=scn.nextInt();
			    }
			    System.out.println(maxarray(arr,0));
		}

}
