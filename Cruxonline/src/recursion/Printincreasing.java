 package recursion;
import java.util.*;
public class Printincreasing {
public static void printdecreasing(int n)
{
	if(n==0)
	{
		return ;
	}
 
printdecreasing(n-1);
System.out.println(n);
}
public static void main(String[] args)
{
	Scanner scn=new Scanner(System.in);
	int x=scn.nextInt();
	printdecreasing(x);
}
}
