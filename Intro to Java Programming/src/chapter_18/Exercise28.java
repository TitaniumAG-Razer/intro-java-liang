package chapter_18;

import java.io.File;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Stack;

/** This program finds the size of a directory without using recursion */
public class Exercise28 {

   public static int fileCount = 0;
   
   public static void main(String[] args) {
      
      File file = new File("C:\\AdwCleaner");
      DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.US);
      DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();
      
      System.out.println("The directory size is " + 
            formatter.format(directorySize(file)) + " bytes");
      System.out.println("There are " + fileCount + " files.");
   }

   public static long directorySize(File source) {

      long size = 0;
      Stack<File> stack = new Stack<>();

      stack.push(source);
      
      File file;
      
      while (!stack.isEmpty()) {
         file = stack.pop();
         if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
               stack.push(files[i]);
         }
         else {
            size += file.length();
            fileCount++;
         }
      }
      return size;
   }
}
