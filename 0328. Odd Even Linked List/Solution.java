//bruteforce solution 
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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(1);
        ListNode epoint = even;
        ListNode opoint = odd;

        ListNode temp = head;

        int i = 0;
        while(temp!=null){
            if(i%2==0){
                epoint.next = new ListNode(temp.val);
                epoint = epoint.next;
            }
            else {
                opoint.next = new ListNode(temp.val);
                opoint = opoint.next;
            }
            temp=temp.next;
            i++;
        }
        even = even.next;
        epoint.next = odd.next;

        return even;
    }
}