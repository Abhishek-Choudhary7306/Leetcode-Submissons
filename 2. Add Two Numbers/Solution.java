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
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int carry = 0;
        int x,y;

        while(h1!=null || h2!=null || carry!=0){

            if(h1!=null){
                x = h1.val;
            }
            else{
                x = 0;
            }

            if(h2!=null){
                y = h2.val;
            }
            else{
                y = 0;
            }

            int sum = x+y+carry;
            carry = sum/10;

            curr.next = new ListNode(sum%10);
            curr = curr.next;

            if (h1 != null) h1 = h1.next;
            if (h2 != null) h2 = h2.next;

        }
        return res.next;
    }
}