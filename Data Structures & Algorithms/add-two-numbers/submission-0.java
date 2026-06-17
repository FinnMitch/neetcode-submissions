/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {
        int one = (l1 != null) ? l1.val : 0;
        int two = (l2 != null) ? l2.val : 0;

        int sum = one + two + carry;
        carry = sum / 10;        // 1 if sum >= 10, else 0
        int digit = sum % 10;    // the ones digit

        cur.next = new ListNode(digit);
        cur = cur.next;

        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
    }

    return dummy.next;
}
}
