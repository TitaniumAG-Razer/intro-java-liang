package chapter_18;

/** Find the smallest integer in an array using recursion */
public class Exercise13 {
   public static void main(String[] args) {
      
      int[] arr = new int[10];
      
      for (int i = 0; i < arr.length; i++)
         arr[i] = 20 - i;
      
      System.out.println(smallestValue(arr));
   }
   
   public static int smallestValue(int[] arr) {
      return smallestValue(arr, arr[arr.length - 1], arr.length - 1);
   }
   
   // Private helper method that uses tail recursion
   private static int smallestValue(int[] arr, int leastValue, int index) {
      if (index < 0)
         return leastValue;
      else if (arr[index] < leastValue) 
         return smallestValue(arr, arr[index], index - 1);
      else
         return smallestValue(arr, leastValue, index - 1);    
   }
}
