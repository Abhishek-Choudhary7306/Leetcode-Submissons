class Solution(object):
    def removeOuterParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        res = []
        depth = 0
        for i in s:
            if(i=='('):
                if(depth>0):
                    res.append(i)
                depth+=1
            else:
                depth-=1
                if(depth>0):
                    res.append(i)
        return ''.join(res)