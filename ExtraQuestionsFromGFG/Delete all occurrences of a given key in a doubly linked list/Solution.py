'''
# Node Class
	class Node:
	    def __init__(self, data):   # data -> value stored in node
	        self.data = data
	        self.next = None
	        self.prev = None
'''
class Solution:
    #Function to delete all the occurances of a key from the linked list.
    def deleteAllOccurOfX(self, head, x):
        # code here
        temp = head
        
        while(temp):
            if temp.data==x:
                if temp==head:
                    head = head.next
                    
                nextNode = temp.next
                prevNode = temp.prev
                
                if nextNode:
                    nextNode.prev = prevNode
                if prevNode:
                    prevNode.next = nextNode
                
                temp = temp.next
                
            else:
                temp = temp.next
                
        return head
                