# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseBetween(self, head, left, right):
        """
        :type head: Optional[ListNode]
        :type left: int
        :type right: int
        :rtype: Optional[ListNode]
        """
        if head is None:
            return None

        dummy = ListNode(0)
        dummy.next = head

        l = head
        bl = dummy

        for i in range(left-1):
            bl = l
            l = l.next

        prev = None

        for i in range((right-left)+1):
            next = l.next

            l.next = prev
            prev = l
            l = next

        bl.next.next = l
        bl.next = prev

        return dummy.next

        