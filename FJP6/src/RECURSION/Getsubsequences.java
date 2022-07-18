package RECURSION;
import java.util.*;

public class Getsubsequences {

	public static ArrayList<String> getss(String s)
	{
		if(s.length()==0)
		{
			ArrayList<String> base=new ArrayList<>();
			base.add(" ");
			return base;
		}
	  String res=s.substring(1);
	  char ch=s.charAt(0);
	  ArrayList<String>rres=getss(res);
	  
	  ArrayList<String> myList=new ArrayList<>();
	  
	  //exc
	  for(String str: rres)
	  {
		  myList.add(str);
	  }
	  //inc
	  
		  for(String str :rres)
		  {
			  myList.add(ch+str);
		  }
	 return myList;
	  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner (System.in);
		String s=scn.nextLine();
		ArrayList<String> get=getss(s);
		System.out.println(get);

	}

}
