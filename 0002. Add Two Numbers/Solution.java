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
        ListNode res = new ListNode(0);
        ListNode r = res;
        ListNode h1 = l1;
        ListNode h2 = l2;
        int carry = 0;
        int sum = 0;
        int a,b;

        while (h1!=null || h2!=null || carry!=0){
            a = h1!=null?h1.val:0;
            b = h2!=null?h2.val:0;

            sum = a+b+carry;
            carry = sum/10;

            r.next = new ListNode(sum%10);

            if(h1!=null){
                h1 = h1.next;
            }
            if(h2!=null){
                h2 = h2.next;
            }

            r = r.next;
        }
        return res.next;
    }
}