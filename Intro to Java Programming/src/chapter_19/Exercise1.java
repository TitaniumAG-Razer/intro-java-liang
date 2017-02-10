package chapter_19;

/** Test the GenericStack Class */
public class Exercise1 {
	public static void main(String[] args) {
		
		GenericStack<String> stack = new GenericStack<>();
		
		// Add 6 items, program will automatically resize private array
		stack.push("I");
		stack.push("am");
		stack.push("a");
		stack.push("happy");
		stack.push("sea");
		stack.push("lion");
		
		System.out.println(stack.toString());
		System.out.println(stack.getSize());
		
		stack.pop();
		
		System.out.println(stack.toString());
		System.out.println(stack.getSize());
	}
}
