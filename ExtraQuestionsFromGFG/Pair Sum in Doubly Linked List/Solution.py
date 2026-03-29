from typing import Optional


from typing import List

"""

Definition for singly Link List Node
class Node:
    def __init__(self,x):
        self.data=x
        self.next=None
        self.prev=None

You can also use the following for printing the link list.
displayList(node)
"""

class Solution:
    def findPairsWithGivenSum(self, target : int, head : Optional['Node']) -> List[List[int]]:
        # code here
        
        res = []
        
        left = head
        right = head
        
        if not head:
            return res
        
        while(right.next):
            right = right.next
            
        while left!=right and right.next!=left:
            total = right.data + left.data
            
            if total==target:
                res.append([left.data,right.data])
                right = right.prev
                left = left.next
            elif total<target:
                left = left.next
            else:
                right = right.prev
                
        return res
                
        
