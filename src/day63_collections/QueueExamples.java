package day63_collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue <String> queue = new PriorityQueue<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.poll());

    }
}
