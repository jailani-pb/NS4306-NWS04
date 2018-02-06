package week5.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LearningLinkedList {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		// Adding new data in LinkedList
		nameList.add("Jailani");
		nameList.add("Rahman");
		nameList.addFirst("Mohammad");
		nameList.add("Aji");
		
		ListIterator<String> iterator = nameList.listIterator();
		// Retrieving data and moving the iterator
		iterator.next();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		if(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		System.out.println(nameList);
		
		// Removing data from LinkedList using ListIterator
		iterator.remove();
		System.out.println(nameList);
		// Remember to move the cursor first before removing
		// the second time.
		iterator.next();
		iterator.remove();
		System.out.println(nameList);
		
		
		// Adding data in LinkedList using ListIterator
		iterator.next();
		iterator.add("Bin");
		System.out.println(nameList);
		
		// Editing data in LinkedList using ListIterator
		iterator.next();
		iterator.set("Abu");
		System.out.println(nameList);
	}
	
}



