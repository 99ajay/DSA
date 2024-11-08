package Basic29;

public class ExpHandle {
public static void main(String[] args) {
//	int x=10;
//	int y=0;
//	int z=(x/y);
//	System.out.println("z"+z);
	try {
		int x=10;
		int y=0;
		int z=(x/y);
	}
	catch(Exception e){
//		System.out.println("Object of e"+e); print simply the object
//		System.out.println("Object of e"+e.getMessage()); print the simply the message ;
//		e.printStackTrace(); -- print line number as well at which the exception will occur.
	}
	System.out.println("Next line is executed successfully");
}
}
