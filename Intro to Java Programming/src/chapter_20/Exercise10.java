package chapter_20;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/** Perform union, difference, and intersection of PriorityQueues */
public class Exercise10 {
   public static void main(String[] args) {

      PriorityQueue<String> queue1 = new PriorityQueue<String>(Arrays.asList(
            new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));

      PriorityQueue<String> queue2 = new PriorityQueue<String>(Arrays.asList(
            new String[] {"George", "Katie", "Kevin", "Michelle", "Ryan"}));

      // Union
      for (String s: queue2) {
         if (!queue1.contains(s))
            queue1.offer(s);
      }
      
      System.out.println("The union of the two priority queue is " + queue1);


      // Difference
      queue1 = new PriorityQueue<String>(Arrays.asList(
            new String[]{"Max", "Jim", "John", "Blake", "Kevin", "Michael"}));

      queue1.removeAll(queue2);

      System.out.println("The difference of the two priority queues is " + queue1);

      // Intersection
      queue1 = new PriorityQueue<String>(Arrays.asList(
            new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));

      queue1.retainAll(queue2);

      System.out.println("The intersection of the two priority queues is " + queue1);
   }
}
