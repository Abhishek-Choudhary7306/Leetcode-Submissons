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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode bl = dummy;
        ListNode l = head;

        for(int i=1;i<left;i++){
            bl = bl.next;
            l = l.next;
        }

        ListNode prev = null;

        for(int i=0;i<(right-left)+1;i++){
            ListNode next = l.next;

            l.next = prev;
            prev = l;
            l = next;
        }

        bl.next.next = l;
        bl.next = prev;

        return dummy.next;

    }
}