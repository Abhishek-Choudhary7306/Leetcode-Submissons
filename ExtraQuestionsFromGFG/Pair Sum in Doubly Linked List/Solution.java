/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        Node left = head;
        Node right = head;
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        if(head==null)return res;
        
        while(right.next!=null){
            right = right.next;
        }
        
        while(left!=right && right.next!=left){
            int sum = left.data+right.data;
            if(sum==target){
                res.add(new ArrayList<>(Arrays.asList(left.data,right.data)));
                left = left.next;
                right = right.prev;
            }
            else if(sum<target){
                left=left.next;
            }
            else{
                right=right.prev;
            }
        }
        return res;
    }
}
