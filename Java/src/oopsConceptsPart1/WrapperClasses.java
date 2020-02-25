package oopsConceptsPart1;

public class WrapperClasses {

	public static void main(String[] args) {
		
		//string to int
		String a="100";
		int x=Integer.parseInt(a);
		System.out.println(x);
		  		//or
		int x1=Integer.valueOf(a);
		System.out.println(x1);
		
		//string to double or float
		String d="74.5";
		double d1=Double.valueOf(d);
		System.out.println(d1);
				//or
		double d2=Double.parseDouble(d);
		System.out.println(d2);
		System.out.println(Float.valueOf(d));
		/*//string to character
		String c='a';
		Character c1=Character.valueOf(c);*/
		
		//string to boolean
		String b="false";
		
		System.out.println(Boolean.parseBoolean(b));
		System.out.println(Boolean.valueOf(b));
		//number format exception
		String s="100a";
		System.out.println(Integer.valueOf(s));
	}

}
