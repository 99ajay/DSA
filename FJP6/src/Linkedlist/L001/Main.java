package Linkedlist.L001;

public class Main {
//public static class Person
//{
//	String name;
//	int age;
//}
	public static class Node
	{
		int data;
		Node next;
	}
	public static class Linkedlist
	{
		Node head;
		Node tail;
		int size;
		void addlast(int val)
		{
			Node node =new Node();
			node.data=val;
			if(this.size==0)
			{
				this.head=node;
				this.tail=node;
			}
			else
			{
				this.tail.next=node;
				this.tail=node;
			}
			this.size++;
		}
		 int size()
		 {
			 return this.size();
		 }
		 void display(){
	            Node ptr = this.head;
	            while(ptr != null){
	                System.out.print(ptr.data+" ");
	                ptr = ptr.next;
	            }
	            System.out.println();
	        }
		 void removeFirst(){
	            if(this.size == 0) System.out.println("List is empty");
	            else if(this.size == 1){
	                this.head = this.tail = null;
	                this.size = 0;
	            }else{
	                Node nbr = this.head.next;
	                this.head.next = null;
	                this.head = nbr;
	                this.size--;
	            }
	        }
		 int getfirst()
		 {
			 if(this.size==0)
			 {
				 System.out.println("List is empty");
				 return -1;
			 }
			 else
			 {
			 return this.head.data;
			 }
		 }
		 int getlast()
		 {
			 if(this.size==0)
			 {
				 System.out.println("List is empty");
				 return -1;
			 }
			 else
			 {
			 return this.tail.data;
			 }
		 }
		 int getat(int idx)
		 {
			 if(this.size==0)
			 {
				 System.out.println("List is empty");
				 return -1;
			 }
			 if(idx<0 || idx>=this.size)
			 {
				 System.out.println("Invalid arguments");
				 return -1;
			 }
			 Node ptr=this.head;
			 int i=0;
			 while(i!=idx)
			 {
				 i++;
				 ptr=ptr.next;
			 }
			 return ptr.data;
			 
		 }
		 void addfirst(int val)
		 {
			 Node ptr=new Node();
			 ptr.data=val;
			 if(this.size==0)
			 {
				 this.head=this.tail=ptr;
			 }
			 else
			 {
				 ptr.next=this.head;
				 this.head=ptr;
			 }
			 size++;
			 
		 }
		 void removelast()
		 {
			 if(this.size==0)
			 {
				 System.out.println("list is empty");
			 }
			 else if(this.size==1)
			 {
				 this.head=this.tail=null;
				 size--;
			 }
			 else
			 {
			  Node ptr=new Node();
			  ptr=this.head;
			  while(ptr.next!=this.tail)
			  {
				   ptr=ptr.next;
			  }
			  ptr.next=null;
			  this.tail=ptr;
			  size--;
			 }
		 }
		 void removeat(int idx)
		 {
			 if(this.size==0)
			 {
				 System.out.println("List is empty");
			 }
			 else if(idx<0 || idx>=this.size-1)
			 {
				 System.out.println("inappropriate index");
			 }
			 else if(idx==0)
			 {
				 removeFirst();
			 }
			 else if(idx==this.size-1)
			 {
				 removelast();
			 }
			 else
			 {
				 Node prev=null;
				 Node curr=this.head;
				 while(idx!=0)
				 {
					 prev=curr;
					 curr=curr.next;
					 idx--;
				 }
				 prev.next=curr.next;
				 curr.next=null;
				 this.size--;
			 }
		 }
		 void addat(int idx,int val)
		 {
			 if(idx<0 || idx>this.size)
			 {
				 System.out.println("Invalid arguments");
			 }
			 else if(idx==0)
			 {
				 addfirst(val);
			 }
			 else if(idx==size)
			 {
				 addlast(val);
			 }
			 else
			 {
				 Node prev=null;
				 Node curr=this.head;
				 while(idx!=0)
				 {
					 prev=curr;
					 curr=curr.next;
					 idx--;
				 }
				 Node ptr=new Node();
				 ptr.data=val;
				 ptr.next=curr;
				 prev.next=ptr;
				 this.size++;
						 
			 }
		 }
}
	public static void main(String[] args)
 	{
//		Person p1=new Person();
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		
//		p1.name="ajay verma";
//		p1.age=67;
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		Linkedlist ll=new Linkedlist();
	    System.out.println(ll);
	    ll.addlast(89);
	    ll.addlast(56);
	    ll.addlast(23);
//	    System.out.println(ll);
//	    ll.display();
//	    ll.removeFirst();
//	    ll.display();
//	    System.out.println(ll.getfirst());
//	    System.out.println(ll.getlast());
//	    System.out.println(ll.getat(1));
//	    ll.addfirst(876);
//	    //ll.removelast();
//	    ll.display();
//	    //ll.removeat(1);
//	    ll.display();
//	    ll.addat(1, 34);
//	    ll.display();
//	    



	    

	    

	    
    }

}
