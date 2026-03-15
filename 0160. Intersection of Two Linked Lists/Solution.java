//one solution 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        int lenA = lenLL(headA);
        int lenB = lenLL(headB);

        int diff = Math.abs(lenA - lenB);

        if(lenA>lenB){
            int i = 0;
            while(i<diff){
                a = a.next;
                i++;
            }
        }
        else{
            int i = 0;
            while(i<diff){
                b = b.next;
                i++;
            }
        }

        while(a!=null){
            if(a==b){
                return a;
            }
            a = a.next;
            b = b.next;
        }

        return null;
    }
    public int lenLL(ListNode head){
        int i = 0;
        ListNode temp = head;
        while(temp!=null){
            i++;
            temp = temp.next;
        }
        return i;
    }
}


