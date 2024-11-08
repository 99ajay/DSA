package Basic4rth;

public class App {
 int x= 10;
 public static void main(String[] args) {
//	 System.out.println(x);-- will show the error -- as we can not access the non static member without creating the object of given class
	 App a1= new App();
	 App a2= new App();
	 
	 a1.x=30;
	 System.out.println(a1.x);
	 System.out.println(a2.x);
 }
}
