package chapter_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/** Display words in descending alphabetical order */
public class Exercise1 {
   public static void main(String[] args) {
      
      if (args.length != 1) {
         System.out.println("Command line usage: file");
         return;
      }
      
      File file = new File(args[0]);
      
      if (!file.exists()) {
         System.out.println("File does not exist.");
         return;
      }
      
      try {
         Scanner input = new Scanner(file);
         List<String> list = new LinkedList<>();
         
         while (input.hasNext()) {
            String nextWord = input.next();
            // Word must start with an alphabetical character
            if (Character.isAlphabetic(nextWord.charAt(0)))
               list.add(nextWord.toLowerCase());
         }
         
         Collections.sort(list);
         
         // Iterate over the list
         for (String s: list) {
            if (s.endsWith(".") || s.endsWith(","))
               s = s.substring(0, s.length() - 1);
            System.out.print(s + " ");
         }
         
         input.close();
      } 
      catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}
