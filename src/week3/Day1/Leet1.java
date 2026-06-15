package week3.Day1;
import java.lang.classfile.components.ClassPrinter.ListNode;

public class Leet1 {
    public boolean hasCycle(ListNode head) {
        
    ListNode slowPtr = head;
    ListNode fastPtr = head;

    while (slowPtr != null
        && fastPtr != null
        && fastPtr.next != null) {

      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;

      if (slowPtr == fastPtr) {
        return true;
      }
    }

    return false;
    }
}
