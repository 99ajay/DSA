package Function;
import java.util.Scanner;
public class Function_demo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x= scn.nextInt();
		if(x>=90 && x<=100)
		{
			System.out.println("A");
			
		}
		else if(x>=80 && x<=89)
		{
			System.out.println("B");
		}
		else if(x>=60 && x<=79)
		{
			System.out.println("C");
		}
		else if(x>=33 && x<=59)
		{
			System.out.println("D");
		}
		else if(x>=0 && x<=32)
		{
			System.out.println("F");
		}
		else
		{
			System.out.println("error");
		}
	 
	 

}
