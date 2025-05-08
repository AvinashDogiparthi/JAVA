package AM_CollectionFramework.C_ComparatorvsComparable;

import java.util.LinkedList;
import java.util.Queue;

public class AQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // add() and offer()
        queue.add("Apple");  // Throws exception if fails
        queue.offer("Banana"); // Returns false if fails
        queue.offer("Cherry");

        System.out.println("Queue after adding elements: " + queue);

        // peek() and element()
        System.out.println("Peek: " + queue.peek());      // Apple (head, does not remove)
        System.out.println("Element: " + queue.element()); // Apple (throws exception if empty)

        // poll() and remove()
        System.out.println("Poll: " + queue.poll());      // Apple (removes head)
        System.out.println("Remove: " + queue.remove());  // Banana (removes head)

        System.out.println("Queue after polling/removing: " + queue);

        // Try removing from empty queue (to show difference)
        queue.clear(); // make it empty
        System.out.println("Poll on empty queue: " + queue.poll()); // returns null
        try {
            System.out.println("Remove on empty queue: ");
            queue.remove(); // throws NoSuchElementException
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
