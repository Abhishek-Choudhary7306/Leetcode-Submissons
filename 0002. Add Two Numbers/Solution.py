# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        
        res = ListNode(0)
        r = res
        h1 = l1
        h2 = l2 

        carry = 0
        add = 0
        a,b = 0,0

        while h1 or h2 or carry:
            a = h1.val if h1 else 0
            b = h2.val if h2 else 0
            
            add = a+b+carry
            carry = add/10

            r.next = ListNode(add%10)

            if h1:
                h1 = h1.next
            if h2:
                h2 = h2.next

            r = r.next

        return res.next
