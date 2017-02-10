package chapter_20;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/** Compare time to traverse a linked list using iterator vs get(index) method */
public class Exercise6 {
   public static void main(String[] args) {
      
      List<Integer> list = new LinkedList<>();
      for (int i = 0; i < 6000000; i++)
         list.add((int)(Math.random() * 201) - 100);
      
      // Using an iterator
      Iterator<Integer> iter = list.iterator();
      long startTime = System.currentTimeMillis();
      while (iter.hasNext()) 
         iter.next();
      long endTime = System.currentTimeMillis();
      long ms = endTime - startTime;
      
      System.out.println("Iterator time: " 
            + ms + " milliseconds.");
      
      // Using get(index)
      startTime = System.currentTimeMillis();
      for (int i = 0; i < list.size(); i++)
         list.get(i);
      endTime = System.currentTimeMillis();
      ms = endTime - startTime;
      
      System.out.println("Get(index) time: "
            + ms + " milliseconds.");
   }
}

/* Explanation: Iterator has O(1) time, 
 * while get(index) is O(N), N = current index */
