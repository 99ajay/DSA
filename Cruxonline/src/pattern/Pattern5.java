//6
//******
// *****
//  ****
//   ***
//    **
//     *







package pattern;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
 Scanner scn=new Scanner(System.in);
 int n=scn.nextInt();
 int nst=n;
 int row=1;
 int nsp=0;
 while(row<=n)
 {
	 int csp=1;
	 while(csp<=nsp)
	 {
		 System.out.print(" ");
		 csp++;
	 }
	 int cst=1;
	 while(cst<=nst)
	 {
		 System.out.print("*");
		 cst++;
	 }
	 System.out.println();
	 row++;
	 nst--;
	 nsp++;
	 
	 
 }
	}

}
