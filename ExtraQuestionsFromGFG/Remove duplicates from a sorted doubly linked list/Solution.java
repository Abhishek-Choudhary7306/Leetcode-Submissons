/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        
        Node curr = head;
        
        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data){
                Node nextToNext = curr.next.next;
                
                curr.next = nextToNext;
                
                if(nextToNext!=null){
                    nextToNext.prev = curr;
                }
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
}