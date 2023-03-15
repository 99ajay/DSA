package Hashmap;
import java.util.HashMap;

public class Hash1 {

	public static void main(String[] args) {
    HashMap<Integer,String>hm=new HashMap<>();
    System.out.println(hm);
    hm.put(10, "ajay verma");
    hm.put(20,  "sumil");

    hm.put(30, "samya");

    hm.put(40, "jethalal");

    hm.put(50, "Thor");
//    System.out.println(hm);
//    
//    System.out.println(hm.containsKey(50));
//    
//    System.out.println(hm.remove(40)+" status of hashmap"+hm);
    
    System.out.println(hm.get(20));
	}

}
