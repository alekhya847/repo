package testPackage;

public class FinallyConcept {
  
	//finally is a block
	
	public static void main(String[] args) {
		//test1();
		//test2();
		//division();
		division1();
	}
	
	public static void test1(){
		try{
			System.out.println(" inside test1 method");
			throw new RuntimeException("test");
		
		}catch(Exception e){
			System.out.println("inside catch block");
		}
		
		finally{
			System.out.println(" test1 finally block");
		}
	}
	
	public static void test2(){
		try{
			System.out.println("inside test2 method");
			
		}
		finally{//without catch block also finally is executed 
			
			System.out.println("test2 finally block");
			}
	}
	
	public static void division(){
		int i=30;
		try{
		int k=i/0;
		System.out.println(k);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			System.out.println("arithmetic exception");
		}
	}
	
	public static void division1(){
		int i=30;
		try{
		int k=i/0;
		System.out.println(k);
		}catch(NullPointerException e){
			System.out.println(e);
		}
		finally{
			System.out.println("arithmetic exception");
		}
	}
	
	
	
	
}
