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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevG = dummy;
        while (true) {
            ListNode kth = prevG;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) break;
            ListNode groupSt = prevG.next;
            ListNode nextG = kth.next;
            ListNode prev = nextG;
            ListNode curr = groupSt;
            while (curr != nextG) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            prevG.next = kth;
            prevG = groupSt;
        }
        return dummy.next;
    }
}