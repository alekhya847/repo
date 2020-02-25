package testPackage;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("zero param constructor");
	}

	public ConstructorConcept(int x) {
		System.out.println("one param constructor");
		System.out.println("the value of x " + x);
	}

	public ConstructorConcept(int x, int y) {
		System.out.println("two param constructor");
		System.out.println("the value of x and y " + (x + y));
	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(100);
		ConstructorConcept obj2 = new ConstructorConcept(100, 200);

	}

}
