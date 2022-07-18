package classandobjects;

public class Personclient {

	public static void main(String[] args) {
    Person p1=new Person();
    Person p2=new Person();
    System.out.println(p1);
    System.out.println(p1.name);
    System.out.println(p1.age);
    p1.name="ajay verma";
    p1.age=45;
    System.out.println(p1.name);
    System.out.println(p1.age);

	}

}
