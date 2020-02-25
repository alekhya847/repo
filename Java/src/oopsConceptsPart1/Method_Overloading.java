package oopsConceptsPart1;

public class Method_Overloading {

	public static void main(String[] args) {
		
		Method_Overloading obj=new Method_Overloading();
		
		obj.add();
		obj.add(20);
		obj.add("alekhya", 24);
		}
	//overloading the main method
	public static void main(int p){
		Method_Overloading obj=new Method_Overloading();
		obj.add(11);
		
	}
	//method overloading:same methodname withdifferent input parameters or different arguments
	public void add(){
		System.out.println("add method");
	}
	public void add(int i){
		System.out.println("add method with one i/p parameter");
		System.out.println(i);
	}
	public void add(String i,int j){
		System.out.println("add method with two i/p parameters");
		System.out.println(i+" "+j);
	}
	
	

}
