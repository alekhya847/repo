package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static <E> void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		ar.add(500);//4
		ar.add("alekhya");//5
		ar.add(12.33);//6
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		ar.remove(2);
		System.out.println(ar.get(2));
		
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		//generic
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(1000);
		ar1.add(2000);
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("sushma");
		ar2.add("avinash");
		
		
		System.out.println(ar2.get(0));
		
		//when we donot know about the type of data
		ArrayList<E> ar3=new ArrayList<E>();
		
		//creating class objects
		Employee e1=new Employee("anvesh",22);
		Employee e2=new Employee("alekhya",25);
		Employee e3=new Employee("sushma",27);
		
		//creating arraylist for employee
		
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to print the values
		Iterator<Employee> itr=ar4.iterator();
		while(itr.hasNext()){
			Employee emp=itr.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
		}
		
		//add all method
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("test");
		ar6.add("java script");
		
		ar5.addAll(ar6);
		Iterator itr1=ar5.iterator();
		for(int i=0;i<ar5.size();i++){
			System.out.println(itr1.next());
		}
		
		System.out.println("+++++");
		//remove all
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("raghu");
		ar7.add("lucky");
		ar5.removeAll(ar7);
		
		for(int j=0;j<ar6.size();j++){
			System.out.println(ar6.get(j));	
		}
		
		System.out.println("**********");
		//retain all
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("raghu");
		ar8.add("reddy");
		ar7.retainAll(ar8);
		
		for(int k=0;k<ar5.size();k++){
			System.out.println(ar7.get(k));
		}
		}
}
