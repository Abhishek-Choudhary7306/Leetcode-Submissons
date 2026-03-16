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