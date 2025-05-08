package leetcode.SummerDay9;

public class SwapNodesInLinkedList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public ListNode swapNodes(ListNode head, int k) {
            ListNode first = head;

            // Move to the k-th node from the start
            for (int i = 1; i < k; i++) {
                first = first.next;
            }

            ListNode temp = first;
            ListNode second = head;

            // Move temp to the end, second follows from head
            while (temp.next != null) {
                temp = temp.next;
                second = second.next;
            }

            // Swap values
            int t = first.val;
            first.val = second.val;
            second.val = t;

            return head;
        }
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        int k = 2;

        Solution sol = new Solution();
        head = sol.swapNodes(head, k);

        System.out.println("List after swapping " + k + "-th node from start and end:");
        printList(head);
    }
}
