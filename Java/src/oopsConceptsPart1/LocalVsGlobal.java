package oopsConceptsPart1;

public class LocalVsGlobal {
	
	//global variables or class variables
	
	String name="alekhya";
	int age=24;
	
	
	
	public static void main(String[] args) {
		
		//local variables
		int i=20;
		int j=30;
		
		//accessing local variables
		System.out.println(i);
		
		
		//accessing global variables in main method we need to create an object with classname only
		LocalVsGlobal obj=new LocalVsGlobal();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}
