package chapter_20;

public class Point implements Comparable<Point> {

   int x;
   int y;
   
   Point() {
      this.x = 0;
      this.y = 0;
   }
   
   Point(int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   @Override
   public int compareTo(Point o) {
      
      if (this.x == o.x)
         return this.y - o.y;
      else
         return this.x - o.x;
   }
   
   @Override
   public String toString() {
      return "(" + this.x + ", " + this.y + ")";
   }
}
