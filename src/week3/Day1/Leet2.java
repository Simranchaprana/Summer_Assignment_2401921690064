package week3.Day1;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Leet2 {
    public ListNode reverseList(ListNode head) {
    
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; 
            curr.next = prev;          
            prev = curr;               
            curr = next;              
        }

        return prev;
    }
}
