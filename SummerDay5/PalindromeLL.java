import java.util.ArrayList;

public class PalindromeLL {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        while (head != null) {
            al.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = al.size() - 1;
        while (left < right) {
            if (!al.get(left).equals(al.get(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLL obj = new PalindromeLL();

        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(2);
        head.next.next.next = obj.new ListNode(1);

        boolean result = obj.isPalindrome(head);
        System.out.println("Is palindrome: " + result);
    }
}
