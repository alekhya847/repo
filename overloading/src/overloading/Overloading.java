package overloading;

public class Overloading {

	public void method1() 
	{
	System.out.println("method1");	
	}
	public void method1(int a)
	{
		System.out.println(a);
	}
	public void method1(String a)
	{
		System.out.println(a);
	}
	public void method1(String a,String b)
	{
		System.out.println(a+b);
	}
	public void method1(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[]args)
	{
		Overloading x=new Overloading();
		x.method1("10","20");
	}

}
