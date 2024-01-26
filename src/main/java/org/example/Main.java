package org.example;

public class Main {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        head.next = next1;
        ListNode next2 = new ListNode(3);
        next1.next = next2;

        System.out.println("BEFORE reversal -> " + head);
        System.out.println("AFTER reversal -> " + reverseList(head));
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while (curr != null) {
            //Set the next node
            next = curr.next;

            // change the direction of curr.next to prev
            curr.next = prev;

            // make curr as prev - moving one step ahead
            prev = curr;

            // make next as curr - moving one step ahead
            curr = next;
        }

        head = prev;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
