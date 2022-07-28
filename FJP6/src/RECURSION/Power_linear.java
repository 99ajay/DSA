package RECURSION;
import java.util.Scanner;

public class Power_linear {
public static int power(int x,int n)
{
	if(n==0)
	{
		return 1;
	}
	int c=x*power(x,n-1);
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		   
		    int x=scn.nextInt();
		    int n=scn.nextInt();
		    System.out.println(power(x,n));
	}

}
