# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """

        if(head==None or head.next==None):
            return True

        fast = head
        slow = head

        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next

        newHead = self.reverse(slow)

        first = head
        second = newHead

        while second:
            if first.val!=second.val:
                self.reverse(newHead)
                return False

            first = first.next
            second = second.next

        self.reverse(newHead)
        return True

    def reverse(self,head):
        curr = head
        prev = None

        while curr:
            nxt = curr.next

            curr.next = prev
            prev = curr
            curr = nxt

        return prev


        