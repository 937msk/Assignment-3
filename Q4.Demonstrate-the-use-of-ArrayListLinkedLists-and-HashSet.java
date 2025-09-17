package assigm;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;

public class Collectionframe {
	
	    public static void main(String[] args) {
	    
	        ArrayList<String> fruits = new ArrayList<>();
	        
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");

	        System.out.println("ArrayList contents:");
	        for (String fruit : fruits) {
	        	
	            System.out.println("- " + fruit);
	        }

	        LinkedList<Integer> numbers = new LinkedList<>();
	        
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);

	        System.out.println("\nLinkedList contents:");
	        for (Integer number : numbers) {
	        	
	        	
	            System.out.println("- " + number);
	        }
	       
	        HashSet<String> uniqueNames = new HashSet<>();
	        uniqueNames.add("Alice");
	        uniqueNames.add("Bob");
	        uniqueNames.add("Alice"); 

	        System.out.println("\nHashSet contents:");
	        for (String name : uniqueNames) {
	        	
	            System.out.println("- " + name);
	        }
	    }
}




