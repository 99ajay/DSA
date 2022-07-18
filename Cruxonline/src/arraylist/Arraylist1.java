package arraylist;
import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());
		list.add(56);
		System.out.println(list);
		System.out.println(list.size());
		list.add(67);
		list.add(45);
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("****************");
		System.out.println(list.get(2));
		list.add(78);
		list.add(78);
		list.add(234);
		list.add(8765);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
//		for(int item : list)
//		{
//			System.out.println(item);
//		}
		
		

	}

}
