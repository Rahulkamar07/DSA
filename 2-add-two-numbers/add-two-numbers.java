/**
 * Definition for singly-linked list.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    // ---------------------------
    // Add this deserialize method
    // ---------------------------
    public static ListNode deserialize(String data) {
        data = data.replace("[", "").replace("]", "").trim();
        if (data.isEmpty()) return null;

        String[] parts = data.split(",");
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (String s : parts) {
            temp.next = new ListNode(Integer.parseInt(s.trim()));
            temp = temp.next;
        }
        return dummy.next;
    }

    // ---------------------------
    // Add serialize for printing
    // ---------------------------
    public static String serialize(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(",");
            head = head.next;
        }

        sb.append("]");
        return sb.toString();
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            temp.next = new ListNode(sum % 10);
            temp = temp.next;

            carry = sum / 10;
        }

        return dummy.next;
    }
}
