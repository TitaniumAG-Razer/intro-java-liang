package chapter_12;

import java.io.File;

/**
 * Program tat pads 0 before i if i is a single digit, and 0 before j if j is a
 * single digit. Exercisei_j in a file. In Java, when you pass the symbol * from
 * the command line, it refers to all files in the directory.
 * 
 * @author Kevin
 *
 */

public class Exercise27 {
	public static void main(String[] args) {
		// Kit.display(args);
		if (args.length == 0) {
			System.out.println("Invalid Arguments.");
			System.out.println("Usage: java Chapter_12.Exercise_27");
			System.exit(1);
		}
		for (String s : args) {
			if (s.matches("Exercise[\\d]_[\\d].*")) {
				StringBuilder sb = new StringBuilder(s);
				sb.insert(s.indexOf('_') - 1, "0");
				sb.insert(s.indexOf('_') + 2, "0");
				new File(s).renameTo(new File(sb.toString()));
			}
		}
	}
}