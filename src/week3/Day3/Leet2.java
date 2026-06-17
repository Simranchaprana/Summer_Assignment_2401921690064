package week3.Day3;

import java.util.Stack;

public class Leet2 {
    Stack<Integer> stack;
     Stack<Integer> minStack;

    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek())
      minStack.push(val);
    }
    
    public void pop() {
        int poppedValue = stack.pop();
         if (poppedValue == minStack.peek())
      minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
