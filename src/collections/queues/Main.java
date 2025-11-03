package collections.queues;

/*-Is an interface
-Elements are processed in the order determined by the queue implementation (FIFO for LinkedList,
priority order for PriorityQueue).
Elements cannot be accessed directly by index.
A queue can store duplicate elements.
Interface: Queue is an interface and cannot be directly instantiated. Concrete implementations
 like
 1. LinkedList,
 2. ArrayDeque (Implements both Queue and Deque (Double-Ended Queue), providing
  efficient operations at both ends and generally outperforming LinkedList for queue operations)
 3. and PriorityQueue -(A special type of queue where elements are ordered based on their natural ordering or a custom Comparator,
  rather than insertion order. The element with the highest priority
  (or smallest value by default) is always at the front.are used.*/

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> fruits = new LinkedList<>();

        //adding elements to the queue
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("queue: " + fruits);

        fruits.remove(); //will remove first element-apple

        for(String f : fruits){
            System.out.println(f);
        }

        PriorityQueue<Integer> nums = new PriorityQueue<>();
        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(3);

        //nums.poll();
//poll->Retrieves and removes the head
        System.out.println("**poll()**\nPriority queue: " + nums);
       // System.out.println("polled: " + nums.poll());
        System.out.println("Priority queue: " + nums);

        // remove->Retrieves and removes the head
        System.out.println("**remove**\nremoved: "+ nums.remove());
        System.out.println(nums);

        //peek()->Retrieves but does not remove the head

        Queue<Integer> marks = new LinkedList<>();
        marks.add(10);
        marks.add(20);
        marks.add(25);
        marks.add(30);

        System.out.println("**peek()**\npeeked: "+ marks.peek());
        System.out.println(marks);




    }
}
