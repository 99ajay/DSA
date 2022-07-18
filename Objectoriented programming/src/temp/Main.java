package temp;
import java.util.*; 
public class Main {
	 static boolean isPrime(int n) //function to check input number is prime or not
	    {
	  
	        if (n <= 1)
	            return false;
	        else if (n == 2)
	            return true;
	        else if (n % 2 == 0)
	            return false;
	        for (int i = 3; i <= Math.sqrt(n); i += 2)
	        {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);  //to use input of integer we write this
		 
		 int c=scn.nextInt(); //taking 1st number input
		 while(c!=0)     //break loop if we get c is equals zero
		 {
			 if(isPrime(c)) //calling isPrime(n) function to check number is prime or not
			 {
				 System.out.println(c+" is a prime number.");//
			 }
			 
			 if(!isPrime(c)) //calling isPrime(n) function to check number is prime or not
			 {
				 System.out.println(c+" is not a prime number.");
			 }
			 
			 c=scn.nextInt();
			 
			 if(c==0) //checking if c will be zero then print "programm is over and break the statement 
			 {
				 System.out.println("programm is over.");
				 break;

			 }
		 }
		 

	}

}
