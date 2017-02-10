package chapter_13;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStack implements Cloneable {
	
  private ArrayList<Object> list = new ArrayList<>();

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int getSize() {
    return list.size();
  }

  public Object peek() {
    return list.get(getSize() - 1);
  }

  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public void push(Object o) {
    list.add(o);
  }

  @Override /** Override the toString in the Object class */
  public String toString() {
    return "stack: " + list.toString();
  }
  
  /** Deep copies the stack **/
  public Object clone() throws CloneNotSupportedException {

	  MyStack stackClone = (MyStack) super.clone();
	  
	  for (int i = 0; i < list.size(); i++) {
		  stackClone.list = (ArrayList<Object>) list.clone();
	  }
	  return stackClone;
  }
}
