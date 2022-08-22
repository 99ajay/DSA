package ARRAY;
import java.util.*;
import java.util.Scanner;

public class Movezero {
	static int Big(int n,int arr[],int k)
	{
		// Queue<Integer> q1,q2,q3;
		 Queue<Integer> q11 = new ArrayDeque<>();
		 Queue<Integer> q21 = new ArrayDeque<>();
		 Queue<Integer> q31 = new ArrayDeque<>();
		 int x=1;
		 for(int i=1;i<=k;i++)
		 {
			 q11.add(x*arr[0]);
			 q21.add(x*arr[1]);
			 q31.add(x*arr[2]);
			 
		 
		 x=Math.min(q11.peek(),Math.min(q21.peek(), q31.peek()));
		 if(x==q11.peek())
		 {
			 q11.remove();
		 }
		 if(x==q21.peek())
		 {
			 q21.remove();
		 }
		 if(x==q31.peek())
		 {
			 q31.remove();
		 }
		 }
		 return x;
		 
	}

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 int n=scn.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=scn.nextInt();
		 }
		 int k=scn.nextInt();
		 System.out.println(Big(n,arr,k));
		 
	}

}
