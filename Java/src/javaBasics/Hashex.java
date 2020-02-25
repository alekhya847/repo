package javaBasics;

import java.util.Hashtable;

public class Hashex {

	public static void main(String[] args) {
		
	Hashtable h=new Hashtable();
	
	h.put("a", "test");//0--index
	h.put("b", "hello");
	h.put("c", "world");
	
	System.out.println(h.size());
	System.out.println(h.get("a"));
	
	System.out.println(h.get("b"));
	
	/*for(int i=0;i<h.size();i++){
		System.out.println(h.get(i));
	}*/
	}

}
