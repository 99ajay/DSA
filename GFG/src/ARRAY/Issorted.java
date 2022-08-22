package ARRAY;
import java.util.*;

public class Issorted {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 int n=scn.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=scn.nextInt();
		 }
		 	//neive method
//		 boolean flag=true;
//		 for(int i=0;i<n;i++)
//
//		 {
//			 for(int j=i+1;j<n;j++)
//			 {
//				 if(arr[j]<arr[i])
//				 {
//					 flag=false;
//				 }
//			 }
//		 }
//		 if(flag)
//		 {
//			 System.out.println(true);
//			 
//			 
//		 }
//		 else
//		 {
//			 System.out.println(false);
//		 }
		 //better approach
		 boolean flag=true;
		 for(int i=1;i<n;i++)
		 {
			 if(arr[i]<arr[i-1])
			 {
				 flag=false;
			 }
			 
		 }
		 	System.out.println(flag);
		 
		 

}}
