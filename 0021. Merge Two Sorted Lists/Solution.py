# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        res = ListNode(0)
        r = res

        p1 = list1
        p2 = list2

        while(p1 and p2):
            if p1.val<p2.val:
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
        