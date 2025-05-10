package AM_CollectionFramework.C_Queue.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class NaturalOrderingDemo {
    public static void main(String[] args) {
        // PriorityQueue with Natural Ordering (Min-Heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(15);

        Iterator<Integer> iterator = pq.iterator();

        // Displaying elements in natural order (Min-Heap)
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
