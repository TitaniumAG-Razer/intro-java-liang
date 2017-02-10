package chapter_11;

/** Answering Question 11.4 in CheckPoints Section **/
public class CheckPoint_4 {
	public static void main(String[] args) {
		B b = new B();
	}
}

class A {
	public A() {
		System.out.println("A's no-arg constructor is invoked");
	}
}


class B extends A {

}

/* Output

A's no-arg constructor is invoked

*/


