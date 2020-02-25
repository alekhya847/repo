package testPackage;

//final is a keyword
public class ChildClass extends ParentClass {
	// to prevent inheritance
	// to prevent method overriding

	public void start(int x, int y) { // this is the overridden method from
										// parent class
		System.out.println("child class  start method");
	}

}
