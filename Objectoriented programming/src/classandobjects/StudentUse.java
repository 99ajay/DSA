package classandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //Scanner scn=new Scanner(System.in);
  Student s1=new Student();//s1 is reference to a object and store address of object which is created in the heap and s1 gets memory in the stack 
  System.out.println(s1);
 // System.out.println(s1.name+ " " +s1.rollnumber);
  s1.name="ajay verma";
  s1.setRollNumber(78);
 // s1.rollnumber=50;
 System.out.println(s1.name+ " " +s1.getRollNumber());
//  s1.name="priyanka patel";
//  s1.rollnumber=45;
 System.out.println(s1.name);


  
	}

}
