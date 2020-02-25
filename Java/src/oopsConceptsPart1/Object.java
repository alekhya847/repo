package oopsConceptsPart1;

public class Object {
	
	//class variables
	
	 String name;
	int age;

	public static void main(String[] args) {
		
		// new object()----- object
		//a,b,c------------- object reference variable
		
		System.out.println(" before references");
		
		Object a=new Object();
		Object b=new Object();
		Object c=new Object();
		a.name="alekhya";
		a.age=24;
		
		b.name="sushmitha";
		b.age=26;
		
		c.name="anvesh";
		c.age=22;
		
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
		System.out.println(a.age);
		
		System.out.println(b.age);
		System.out.println(c.age);
		//System.out.println(b.age);
		
		System.out.println("after references");
		
		a=b;
		b=c;
		
		
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
		System.out.println(a.age);
		System.out.println(b.age);
		System.out.println(c.age);
		
	}

}
