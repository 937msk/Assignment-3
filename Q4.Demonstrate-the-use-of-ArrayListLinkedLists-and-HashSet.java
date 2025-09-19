package assigm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;

public class CollectionFrame {

    public static void main(String[] args) {

        // ArrayList Example
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("ArrayList contents:");
        for (String fruit : fruits) {
            System.out.println(" " + fruit);
        }

        //LinkedList Example
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nLinkedList contents:");
        for (Integer number : numbers) {
            System.out.println("- " + number);
        }

        //HashSet Example
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); 

        System.out.println("\nHashSet contents:");
        for(String name : uniqueNames) {
            System.out.println(" " + name);
        }

        // 4. Explanation of differences
        System.out.println("\n Differences between ArrayList, LinkedList, and HashSet");
        System.out.println("ArrayList: Maintains insertion order and allows duplicate elements. "
                         + "It is efficient for accessing elements by index.");
        System.out.println("LinkedList: Maintains insertion order and allows duplicates. "
                         + "It is efficient for adding or removing elements from the middle or ends.");
        System.out.println("HashSet: Does not allow duplicate elements and does not maintain insertion order. "
                         + "It is efficient for checking if an element exists.");
    }
}
