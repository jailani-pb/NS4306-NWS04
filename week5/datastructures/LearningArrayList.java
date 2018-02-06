package week5.datastructures;

import java.util.ArrayList;

public class LearningArrayList {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		// Adding new data into ArrayList
		nameList.add("Jailani");
		nameList.add("Abdul");
		nameList.add("Rahman");
		nameList.add(1, "Haji");
		
		System.out.println(nameList);
		
		// Removing existing data from ArrayList
		nameList.remove(0);
		nameList.remove("Rahman");
		
		System.out.println(nameList);
		
		// Editing existing data in ArrayList
		nameList.set(0, "Mohammad");
		
		System.out.println(nameList);
		
		// Retrieving existing data in ArrayList
		System.out.println(nameList.get(0));
		System.out.println(nameList.get(1));
		
		// Retrieving the size of an ArrayList
		System.out.println(nameList.size());
		nameList.add("Jailani");
		System.out.println(nameList.size());
		
	}
	
}



