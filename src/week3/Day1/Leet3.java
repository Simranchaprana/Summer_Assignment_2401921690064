package week3.Day1;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Leet3 {
    public ListNode middleNode(ListNode head) {
        ListNode slowPtr = head;
    ListNode fastPtr = head;

    while (fastPtr != null && fastPtr.next!= null) {

      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
    }

    return slowPtr;

    }
}
