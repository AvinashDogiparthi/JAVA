package AM_CollectionFramework.A_Introduction;

import java.util.*;

public class CollectionVsCollections {
    public static void main(String[] args) {
        // Collection (interface) usage
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Collection contents: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Collections (utility class) usage
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1));

        Collections.sort(numbers);  // ascending
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max: " + max + ", Min: " + min);

        Collections.fill(numbers, 100);  // All elements set to 100
        System.out.println("After fill(): " + numbers);

        List<String> singletonList = Collections.singletonList("One");
        System.out.println("Singleton List: " + singletonList);
    }
}

