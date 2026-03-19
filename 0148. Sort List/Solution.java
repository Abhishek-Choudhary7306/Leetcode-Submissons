//using Merge Sort

class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode mid = findMid(head);

        ListNode left = head;
        ListNode right = mid.next;

        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        return mergeSorted(left,right);
    }

    public ListNode mergeSorted(ListNode head1,ListNode head2){
        ListNode h1 = head1;
        ListNode h2 = head2;

        ListNode res = new ListNode(0);
        ListNode r = res;

        while(h1!=null && h2!=null){
            if(h1.val<h2.val){
                r.next = h1;
                r = r.next;
                h1 = h1.next;
            }
            else {
                r.next = h2;
                r = r.next;
                h2 = h2.next;
            }
        }

        while(h1!=null){
            r.next = h1;
            r = r.next;
            h1 = h1.next;
        }

        while(h2!=null){
            r.next = h2;
            r = r.next;
            h2 = h2.next;
        }
    return res.next;
    }

    public ListNode findMid(ListNode head){
        if(head==null)return null;
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

// using Bubble Sort

// class Solution {
//     public ListNode sortList(ListNode head) {
//         ListNode h1 = head;

//         while(h1!=null){
//             ListNode h2 = h1;
//             while(h2!=null){
//                 if(h1.val>h2.val){
//                     int temp = h1.val;
//                     h1.val = h2.val;
//                     h2.val = temp;
//                 }
//                 h2 = h2.next;
//             }
//             h1 = h1.next;
//         }

//         return head;
//     }
// }