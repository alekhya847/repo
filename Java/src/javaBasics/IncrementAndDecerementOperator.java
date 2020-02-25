package javaBasics;

public class IncrementAndDecerementOperator {

	public static void main(String[] args) {
		
		
		int i=1;
		int j=i++;//post increment
		
		System.out.println(i);
		System.out.println(j);
		
		int k=2;
		int l=++k;//pre increment

		System.out.println(k);
		System.out.println(l);
		
		int m=5;
		int n=m--;//post decrement
		
		System.out.println("value of m"+" "+m);
		System.out.println(n);
		
		int p=20;
		int q=--p;//pre decrement
		
		System.out.println(p);
		System.out.println(q);
		
	}

}
