package chapter_17;

import java.io.*;

/** This program combines source files into a single target file */
public class Exercise12 {
   public static void main(String[] args) {
      
      if (args.length < 2) {
         System.out.println("Usage: java Exercise17_10 SourceFile1 ..."
               + " SourceFilen TargetFile");
         return;
      }
      
      // Verify source files exist
      File file;
      
      for (int i = 0; i < args.length - 2; i++) {
         file = new File(args[i]);
         if (!file.exists()) {
            System.out.println("A file doesn't exist.");
            return;
         }
      }
         
      // Verify the target file does not exist (yet)
      file = new File(args[args.length - 1]);
      if (file.exists()) {
         System.out.println("Output file exists already.");
         return;
      }

      // Start writing the file contents into the source file
      try {
         BufferedOutputStream output = new BufferedOutputStream
               (new FileOutputStream(file, true));
         BufferedInputStream input;
         int value;
         
         for (int i = 0; i < args.length - 2; i++) {
            file = new File(args[i]);
            input = new BufferedInputStream(new FileInputStream(file));
            while ((value = input.read()) != -1)
               output.write(value);
         }
         
         output.close();
      }
      catch (IOException e) {
         System.out.println("I/O Error.");
      }
   }
}
