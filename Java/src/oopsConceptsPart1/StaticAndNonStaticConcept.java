package oopsConceptsPart1;

public class StaticAndNonStaticConcept {

	String name="alekhya";//non-static global variable
	static int age=24;//static global variable
	
	
	public static void main(String[] args) {
	
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.add();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		obj.div();
		
		
	}

	public void add(){
		System.out.println(name);
	}
	
	public static void div(){
		System.out.println("static method");
	}
	
	
}
