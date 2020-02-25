package oopsConceptsPart1;

public class CallByValAndCallByRef {

	int a;
	int b;
	
	
	public static void main(String[] args) {
		
		CallByValAndCallByRef obj=new CallByValAndCallByRef();
		int x=10;
		int y=20;
		
		obj.add(x, y);//call by value (or) pass by value:copy of x and y values will be given to a and b 
		
		obj.a=100;
		obj.b=200;
		
		obj.swap(obj);
		

	}
	
	public void add(int a,int b){
		System.out.println(a+b);
		
	}
	
	public
	void swap(CallByValAndCallByRef t){//call by reference
		int temp;
		temp=t.a;//temp=100
		t.a=t.b;//t.a=200
		t.b=temp;//t.b=100
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.a+t.b);
		
	}

}
