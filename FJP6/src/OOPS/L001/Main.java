package OOPS.L001;

public class Main {
public static class Person
{
	int age;
		String name;
	public void sayshi()
	{
		System.out.println(name+"["+age+"]"+" hello");
	}
	
	
	//constructor
	Person()
	{
		System.out.println("instance");
		name="-";
		age=1;
	}
	Person(String n,int a)
	{
		System.out.println("parameterized");
		name=n;
		age=a;
	}
	
	//end of constructor
	
	//this keyword reason
	
}
public static void swap(Person p1,Person p2)
{
	Person tmp=p1;
	p1=p2;
	p2=tmp;
}
public static void game2(Person p1,Person p2)
{
	int tage=p1.age;
	p1.age=p2.age;
	p2.age=tage;
	
	String tname=p1.name;
	p1.name=p2.name;
	p2.name=tname;
}
public static void game3(Person p1,Person p2)
{
	int tage=p1.age;
	p1.age=p2.age;
	p2.age=tage;
	
	String tname=p1.name;
	p1.name=p2.name;
	p2.name=tname;
	p1=new Person();
	p2=new Person();
	
}
public static void game4(Person p1,Person p2)
{
	int tage=p1.age;
	p1.age=p2.age;
	p2.age=tage;
	
	p1=new Person();
	p2=new Person();
	
	String tname=p1.name;
	p1.name=p2.name;
	p2.name=tname;
	 
	
}
public static void game5(Person p1,Person p2)
{
	p2=new Person();
	int tage=p1.age;
	p1.age=p2.age;
	p2.age=tage;
	
	p1=new Person();
	 
	
	String tname=p1.name;
	p1.name=p2.name;
	p2.name=tname;
}
public static void main(String arhs[])
{
//	Person p1=new Person();
//	p1.sayshi();
//	p1.name="ajay verma";
//	p1.age=34;
//	p1.sayshi();
	
//	Person p1=new Person();
//	p1.name="pep";
//	p1.age=3;
//	
//	Person p2=new Person();
//	p2.name="abc";
//	p2.age=4;
//	
//	p1.sayshi();
//	p2.sayshi();
//	game5(p1,p2);
//	p1.sayshi();
//	p2.sayshi();
	Person p1=new Person("pep",3);
	p1.sayshi();
	
}
}
