package ARRAY;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 int n=scn.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=scn.nextInt();
		 }
		 int low=0;
		 int high=n-1;
		 while(low<high)
		 {
			 int temp=arr[low];
			 arr[low]=arr[high];
			 arr[high]=temp;
			 low++;
			 high--;
			 
		 }
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(arr[i]);
		 }

	}

}
