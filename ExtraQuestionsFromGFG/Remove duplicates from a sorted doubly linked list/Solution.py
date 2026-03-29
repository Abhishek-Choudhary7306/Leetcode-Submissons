'''
class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None
        self.prev = None
'''
class Solution:
    #Function to remove duplicates from unsorted linked list.
    def removeDuplicates(self, head):
        # code here
        # return head after editing list
        
        curr = head
        
        while curr and curr.next:
            if(curr.data == curr.next.data):
                nextToNext = curr.next.next
                
                curr.next = nextToNext
                
                if(nextToNext):
                    nextToNext.prev = curr
                
            else:
                curr = curr.next
                
        return head