package GT;
import java.util.*;
public class Main{
    static class Node{
        int data;
        ArrayList<Node> children;

        Node(int data){
            this.data = data; 
            children = new ArrayList<>();
        }
    }
    public static Node construct(Integer []arr){
        Stack<Node> st = new Stack<>();

        Node root = new Node(arr[0]);
        st.push(root);

        int idx = 1;
        while(idx < arr.length){
            Integer val = arr[idx];

            if(val == null){
                st.pop();
            }else{
                Node node = new Node(val);
                Node par = st.peek();
                par.children.add(node);
                st.push(node);
            }
            idx++;
        }
        return root;
    }
    public static void display(Node node) {
         System.out.print(node.data+" -> ");
        for (Node child : node.children) {
          System.out.print(child.data+" ");
        }
          System.out.println(".");
        

        for (Node child : node.children) {
          display(child);
        }
      }
    public static int size(Node node)
    {
    	 int count=0;
    	 for (Node child : node.children) {
              count=count+size(child);
           }
             
           

           
           return count+1;
    }
    public static int max(Node node)
    {
    	int res=Integer.MIN_VALUE;
    	for(Node child : node.children)
    	{
    		res=Math.max(res,max(child));
    	}
    	return Math.max(res, node.data);
    }
    public static int height(Node node)
    {
    	 int h = -1;

    	  for (Node child : node.children) {
    	    int ch = height(child);
    	    h = Math.max(h, ch);
    	  }
    	  h += 1;
    	  return h;
    }
    public static void main(String args[]){
        Integer []arr = {10, 20, 50, null, 60, null, null, 30, 70, 90, null, 100, null, 110, null, null, null, 40, 80, null, null, null};
        Node root = construct(arr);
        display(root);
        int treesize=size(root);
        System.out.println(treesize);
        int x=max(root);
        System.out.println(x);
        int y=height(root);
        System.out.println(y);
    }
}