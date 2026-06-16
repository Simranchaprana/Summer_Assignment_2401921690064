package week3.Day2;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Leet2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode firstPtr = dummy;
    ListNode secondPtr = dummy;

    for (int i = 0; i < n; i++) {
      secondPtr = secondPtr.next;
    }

    while(secondPtr.next != null) {
      firstPtr = firstPtr.next;
      secondPtr = secondPtr.next;
    }
    firstPtr.next = firstPtr.next.next;

    return dummy.next; 
}
}