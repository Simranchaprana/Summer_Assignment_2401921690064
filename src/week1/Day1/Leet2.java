package week1.Day1;

import java.lang.classfile.components.ClassPrinter.ListNode;

//Remove Duplicates from Sorted List
public class Leet2 {
    public ListNode deleteDuplicates(ListNode head) {

    ListNode prev = head;
    ListNode temp = prev.next;

    while (temp != null) {
      if (temp.val == prev.val) {
        temp = temp.next;
        continue;
      }

      prev.next = temp;
      prev = temp;
      temp = temp.next;
    }

    prev.next = null;
    return head;
  }

}

