# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def sortList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """

        if not head or not head.next:
            return head

        mid = self.findMid(head)

        left = head
        right = mid.next
        mid.next = None

        left = self.sortList(left)
        right = self.sortList(right)

        return self.mergeSorted(left,right)



    def findMid(self,head):
        if not head:
            return head
        fast = head.next
        slow = head

        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next

        return slow

    def mergeSorted(self,head1,head2):
        res = ListNode(0)
        r = res

        p1 = head1
        p2 = head2

        while p1 and p2:
            if(p1.val<p2.val):
                r.next = p1
                r = r.next
                p1 = p1.next
            else:
                r.next = p2
                r = r.next
                p2 = p2.next

        while p1:
            r.next = p1
            r = r.next
            p1 = p1.next

        while p2:
            r.next = p2
            r = r.next
            p2 = p2.next

        return res.next

        