package pattern;
import java.util.Scanner;

public class Pattern0 {

	/*package whatever //do not write package name here */

	 
		public static void main (String[] args) {
		    Scanner scn=new Scanner(System.in);
		    int n=scn.nextInt();
		    
		    int array[] =new int[n];
		    for(int i=0;i<n;i++)
		    {
		        array[i]=scn.nextInt();
		    }
		    int start=0;
		    int end=n-1;
		    while(start<=end)
		    {
		        int temp=array[start];
		        array[start]=array[end];
		        array[end]=temp;
		        start++;
		        end--;
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.println(array[i]+" ");
		    }
		}
	
}
