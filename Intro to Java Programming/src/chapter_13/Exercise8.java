package chapter_13;

/** Test the MyStack Class **/
public class Exercise8 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		MyStack original = new MyStack();
		
		original.push(1);
		original.push(2);;
		original.push(3);
		
		MyStack copy = (MyStack) original.clone();
		
		/** Should both be 3 **/
		System.out.println(original.getSize());
		System.out.println(copy.getSize());
		
		original.pop();
		
		/** Copy size should not be changed **/
		System.out.println(original.getSize());
		System.out.println(copy.getSize());	
	}
}
