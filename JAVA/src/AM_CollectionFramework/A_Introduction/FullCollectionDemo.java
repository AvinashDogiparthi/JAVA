package AM_CollectionFramework.A_Introduction;

import java.util.*;

public class FullCollectionDemo {
    public static void main(String[] args) {
        // Creating a collection of strings
        Collection<String> fruits = new ArrayList<>();

        // add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // size()
        System.out.println("Size: " + fruits.size());

        // isEmpty()
        System.out.println("Is empty? " + fruits.isEmpty());

        // contains()
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

        // toArray()
        Object[] fruitArray = fruits.toArray();
        System.out.println("Array contents: " + Arrays.toString(fruitArray));

        // remove(Object o) - removes the element if it exists
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // addAll(Collection c) - adds all elements from another collection
        List<String> moreFruits = Arrays.asList("Papaya", "Orange");
        fruits.addAll(moreFruits);
        System.out.println("After addAll(): " + fruits);

        // removeAll(Collection c)
        List<String> toRemove = Arrays.asList("Papaya", "Apple");
        fruits.removeAll(toRemove);
        System.out.println("After removeAll(): " + fruits);

        // equals(Object o)
        Collection<String> compareList = new ArrayList<>();
        compareList.add("Orange");
        System.out.println("Is equal to compareList? " + fruits.equals(compareList));

        // stream()
        System.out.println("Stream output:");
        fruits.stream().forEach(System.out::println);

        // parallelStream()
        System.out.println("Parallel stream output:");
        fruits.parallelStream().forEach(System.out::println);

        // clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        // ➕ Now showing remove() with Integer (Wrapper vs Primitive)
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        numbers.remove(2);  // Removes index 2 (element 3), because remove(int index)
        System.out.println("After remove(2): " + numbers);  // Output: [1, 2, 4, 5]

        numbers.remove(Integer.valueOf(4));  // Removes element 4
        System.out.println("After remove(Integer.valueOf(4)): " + numbers);  // Output: [1, 2, 5]
    }
}


