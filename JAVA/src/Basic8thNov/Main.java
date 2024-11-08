package Basic8thNov;

public class Main {

	public static void main(String[] args) {
//		int[] x = new int[3];
//		x[0] = 10;
//		x[1] = 20;
//		x[2] = 30;
//		System.out.println(x);
//		System.out.println(x.length);
	//Method 1	
//		for(int i=0;i<3;i++) {
//			System.out.println(x[i]);
//		}
// x[3] -- directly go to particulary point .. better for that purpose ., drwback-- if i remove  the particular value index-- i need to reorder again -- that will be expensive things 
		// removing -- performance issue,
		//reading -- good 
		//Adding -- wrost.-- performance related issue.
	//Method2 -- best for data structure
//		for(int arr:x) {
//			System.out.println(arr);
//		}
		
		String[] x = new String[3];
		for(String str: x) {
			System.out.println(str);
		}		
		
		

	}

}


//Array
//It can store collection of values, Memory address should be continuous, Array starts with index zero.
//Arrays store default value depands on different dataType.
//storing the value in data structure-- made a different different options.


//1. Storing the name of all team name in "Array ds"--
//2. Array is just like train bogi-- 
//3. we can use - array like -- int[] x = new int[3]; -- it will search for "12 bytes" in the ram .
//4. X[1]
//	 index number*memorySize + start memory address
//x[0] -- 0*4+20 = 20
//x[1] -- 1*4+20 = 24
//x[2] -- 2*4+20 = 28

//it will take space of 12 Bytes.

// int[] x = new int[3]; new object is created here --

