package chapter_20;

import java.util.Comparator;

public class CompareY implements Comparator<Point> {

   @Override
   public int compare(Point a, Point b) {

      if (a.y == b.y)
         return a.x - b.x;
      else
         return a.y - b.y;
   }

}
