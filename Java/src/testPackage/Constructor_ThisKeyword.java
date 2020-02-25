package testPackage;

public class Constructor_ThisKeyword {
	// class vars or global vars
	String name = "sushma";
	int age = 27;

	public Constructor_ThisKeyword(String name, int age) {// two param
															// constructor
		System.out.println(name);
		System.out.println(age);
		System.out.println(this.name);
		System.out.println(this.age);
	}

	public static void main(String[] args) {

		Constructor_ThisKeyword obj = new Constructor_ThisKeyword("alekhya", 25);

	}

}
