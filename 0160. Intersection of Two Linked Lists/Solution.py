# one solution 

class Solution(object):
    def getIntersectionNode(self, headA, headB):

        lenA = self.length(headA)
        lenB = self.length(headB)

        a = headA
        b = headB

        diff = abs(lenA - lenB)

        if lenA > lenB:
            for _ in range(diff):
                a = a.next
        else:
            for _ in range(diff):
                b = b.next

        while a and b:
            if a == b:
                return a
            a = a.next
            b = b.next

        return None

    def length(self, head):
        count = 0
        temp = head
        while temp:
            count += 1
            temp = temp.next
        return count