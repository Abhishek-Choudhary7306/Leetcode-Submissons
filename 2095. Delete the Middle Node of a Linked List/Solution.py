# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteMiddle(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if not head or not head.next:
            return None

        prev = None
        fast = head
        slow = head

        while fast and fast.next:
            prev = slow
            fast = fast.next.next
            slow = slow.next

        prev.next = slow.next

        return head