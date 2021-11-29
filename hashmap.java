package main;

import java.util.HashMap;
import java.util.Map;

public class Mapuser {

	public static void main(String[] args) {

		// Create a map that associates a username with it's age
		Map<String, Integer> namesage = new HashMap<>();
		// Add a few users in it
		namesage.put("Janni", 13);
		namesage.put("Marry", 34);
		namesage.put("Ace", 17);
		namesage.put("John", 25);
		namesage.put("Jake", 5);
		namesage.put("Lorry", 7);

		// Write a loop that iterates through the keys of the map and prints them
		System.out.print("All names: ");
		for (Map.Entry<String, Integer> pairEntry : namesage.entrySet()) {
			System.out.print(pairEntry.getKey() + ", ");
		}
		// Write a loop that iterates through the values of the map and prints them
		System.out.println();
		System.out.print("All ages: ");
		for (Map.Entry<String, Integer> pairEntry : namesage.entrySet()) {
			System.out.print(pairEntry.getValue() + ", ");
		}
		System.out.println();
		System.out.println();

		// Print all the users within a range of age
		System.out.println("All the people older than 10: ");
		for (Map.Entry<String, Integer> pairEntry : namesage.entrySet()) {
			if (pairEntry.getValue() > 10) {
				System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
			}
		}
		System.out.println();

		// Update the age of a user based on it's name
		namesage.replace("Janni", 30);
		System.out.println("Janni's modified age: " + namesage.get("Janni"));
		System.out.println();

		// Remove a user based on it's age
		// Remove a user based on it's name
		namesage.remove("Ace");
		namesage.remove("Marry", 34);
		System.out.println("Modified list:");
		for (Map.Entry<String, Integer> pairEntry : namesage.entrySet()) {
			System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
		}

		// Answer to the question - why this class is called HashMap ?
		// Answ: HashMap is known as HashMap because it uses a technique called Hashing,
		// Hashing is the process of converting a given key into another value

	}
}
