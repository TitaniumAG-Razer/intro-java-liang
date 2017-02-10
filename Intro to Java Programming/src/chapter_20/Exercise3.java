package chapter_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/** Store pairs of states and capitals in a map, and then generate a quiz. 
 * This version only uses 10 questions/answers. */
public class Exercise3 {
   public static void main(String[] args) {
      
      Map<String, String> hashMap = new HashMap<>();
      hashMap.put("Montgomery", "Alabama");
      hashMap.put("Sacramento", "California");
      hashMap.put("Little Rock", "Arkansas");
      hashMap.put("Honolulu", "Hawaii");
      hashMap.put("Annapolis", "Maryland");
      hashMap.put("Boston", "Massachusetts");
      hashMap.put("Salt Lake City", "Utah");
      hashMap.put("Lincoln", "Nebraska");
      hashMap.put("Columbus", "Ohio");
      hashMap.put("Albany", "New York");
      
      List<String> states = new ArrayList<String>(hashMap.values());
      Collections.shuffle(states);
      
      Scanner input = new Scanner(System.in);
      String answer;
      System.out.println("Type \"Exit\" to quit anytime.");
      
      for (String s: states) {  
         while(true) {
            
            System.out.print("What is the capital of " + s + "? ");
            answer = input.nextLine();
            
            if (answer.equals("Exit"))
               return;
            else if (!hashMap.containsKey(answer) || 
                  !hashMap.get(answer).equals(s))
               System.out.println("Incorrect.");
            else {
               System.out.println("Correct.");
               break;
            }
         }
      }
      
      input.close();
   }
}

