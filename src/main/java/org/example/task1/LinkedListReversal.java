package org.example.task1;

public class LinkedListReversal {

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }




    public static ListNode reverseInGroups(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        int count = 0;
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = reverseInGroups(next, k);
        }

        return prev;
    }

}
