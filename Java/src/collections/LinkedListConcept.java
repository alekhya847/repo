package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		LinkedList<String> ll=new LinkedList<String>();
		//adding the elements
		ll.add("alekhya");
		ll.add("anvesh");
		ll.add("sushma");
		ll.add("srinath");
		ll.add("srikanth");
		
		System.out.println(ll);
		//adding the first element
			ll.addFirst("swapna");
			
			//adding the last element
			ll.addLast("vijaya");
			
			System.out.println(ll);
			
			//to get the elements
			System.out.println(ll.get(3));
			//to get first element
			System.out.println(ll.getFirst());
			//to get last element
			System.out.println(ll.getLast());
			//to set the elements
			ll.set(4, "avinash");
			System.out.println("========");
			System.out.println(ll);
			
			//to remove first and last elements
			ll.removeFirst();
			ll.remove(4);
			System.out.println(ll);
			
			//to print all the values
			//1:for loop
			System.out.println("using for loop");
			for(int i=0;i<ll.size();i++){
				System.out.println(ll.get(i));
			}
			//2.advanced for loop(for each loop)
			System.out.println("****using for each loop");
			for(String ll1:ll){
				System.out.println(ll1);
			}
			
			//3.while loop
			System.out.println("****using while loop");
			int num=0;
			while(ll.size()>num){
				System.out.println(ll.get(num));
				num++;
			}
			
			
			
			//4.using iterator
				System.out.println("***using iterator");
			Iterator<String> itr=ll.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			
			
			
	}

}
