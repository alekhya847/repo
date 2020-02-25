
package oopsConceptsPart2;

public class TestMethod {

	public static void main(String[] args) {
		
		
//static polymorphism--compile time polymorphism
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		
		
		System.out.println("**************");
		
		
		Car c=new Car();
		c.start();
		c.stop();
		
		System.out.println("*********");
		
//top-casting:child class object can be referred by parent class variables(run-time polymorphism)
		 Car c1=new BMW();
		 c1.start();
		 c1.stop();
		 c1.refuel();
		
		 System.out.println("**********");
		 
 //down-casting:parent class object referring by child class variable but not possible
//since parent cannot acquire properties from child
		 
		 BMW b1=(BMW) new Car();
		 b1.start();
		 b1.stop();
		 b1.refuel();

	}

}
