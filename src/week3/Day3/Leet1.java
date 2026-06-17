package week3.Day3;

import java.util.Stack;

public  class Leet1 {
     public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {

      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');

      else if (stack.isEmpty() || stack.pop() != c)
        return false;
    }
    return stack.isEmpty(); 
    }
}
