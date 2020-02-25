package javaBasics;

import java.util.ArrayList;

public class arrayex {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		 al.add("alekhya");
		 al.add("anvesh");
		 System.out.println(al.size());
		 
		 
		 al.add("sushmitha");
		 al.add("avinash");
		 al.add(" RK reddy");
		 
		 System.out.println(al.size());

		 al.add("raghu");
		 al.add("sagar");
		 al.add("priyanka");
		 al.add("lucky");
		 
		 System.out.println(al.size());
		 
		
		 
		 for(int i=0;i<al.size();i++){
			 System.out.println(al.get(i));
		 }
	
		ArrayList<Integer> ai= new ArrayList<Integer>();
		ai.add(100);
		ai.add(200);
		ai.add(300);
		
		System.out.println(ai.get(0));
		System.out.println(ai.get(1));
		System.out.println(ai.get(2));
		
		for(int i=0;i<al.size();i++){
			
			System.out.println(ai.get(i));
			}
		
		
	}

}
