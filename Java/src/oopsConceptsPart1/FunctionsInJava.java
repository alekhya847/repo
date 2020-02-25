package oopsConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj=new FunctionsInJava();
		
		int o=obj.pqr();
		System.out.println(o);
		
		obj.division(30,10);
	}
		public void test(){ //no input no output
			System.out.println("test method");
		
		}
			
		public int pqr(){//no input some output
			int a=10;
			int b=20;
			int c=a+b;
			
			
			return c;
			
			
		}
		
		public int division(int x,int y){//some input some output
			
			
			 int z=x/y;
			System.out.println(z);
			return z;
		}
		
		public int addition(int x,int y){//some input no output
			
			int r=20;
			int t=30;
			int e=r+t;
			return e;
		}
		
		

	}


