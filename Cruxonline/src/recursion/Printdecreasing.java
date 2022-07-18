package recursion;
import java.util.*;
public class Printdecreasing {
public static void printdecreasing(int n)
{
	if(n==0)
	{
		return ;
	}
System.out.println(n);
printdecreasing(n-1);
}
public static void main(String[] args)
{
	Scanner scn=new Scanner(System.in);
	int x=scn.nextInt();
	printdecreasing(x);
}
}
