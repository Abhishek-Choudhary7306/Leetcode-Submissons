class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode r = res;

        ListNode p1 = list1;
        ListNode p2 = list2;

        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                r.next = p1;
                r = r.next;
                p1 = p1.next;
            }
            else {
                r.next = p2;
                r = r.next;
                p2 = p2.next;
            }
        }

        while (p1!=null){
            r.next = p1;
            r = r.next;
            p1 = p1.next;
        }

        while(p2!=null){
            r.next = p2;
            r = r.next;
            p2 = p2.next;
        }

        return res.next;
    }
}