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
    public ListNode Rev(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        ListNode next = head;
        while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode s = head,f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode fh = head;
        ListNode sh = Rev(s);
        while(fh!=null && sh!=null){
            if(fh.val!=sh.val){
                return false;
            }
            fh=fh.next;
            sh=sh.next;
        }
        return true;
    }
}