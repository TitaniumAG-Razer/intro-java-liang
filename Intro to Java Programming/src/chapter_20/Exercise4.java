package chapter_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/** This class tests the Point and CompareY classes */
public class Exercise4 {
   public static void main(String[] args) {
      
      List<Point> list = new ArrayList<>(200);
      int xCoord, yCoord;
      
      for (int i = 0; i < 200; i++) {
         xCoord = (int)(Math.random() * 51) - 25;
         yCoord = (int)(Math.random() * 51) - 25;
         list.add(new Point(xCoord, yCoord));
      }
      
      // Sorted by Comparable, x values
      Collections.sort(list);
      System.out.println("Sorted by X values, ascending: ");
      System.out.print(list);
      
      // Sorted by Comparator, y values
      Collections.sort(list, new CompareY());
      ListIterator<Point> iter = list.listIterator(list.size());
      
      System.out.println("\n\nSorted by Y values, descending: ");
      while (iter.hasPrevious()) {
         System.out.print(iter.previous() + " ");
      }
   }
}
