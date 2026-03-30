class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        i = 0
        res = 0
        sign = 1
        n = len(s)

        INT_MAX = 2**31 - 1
        INT_MIN = -2**31

        while i<n and s[i]==' ':
            i+=1
        
        if i<n and (s[i]=='+' or s[i]=='-'):
            if s[i]=='-':
                sign = -1
            i+=1

        while i<n and s[i].isdigit():
            digit = int(s[i])
            
            if res > (INT_MAX - digit) // 10:
                return INT_MAX if sign == 1 else INT_MIN

            res = res*10 + digit
            i+=1

        return sign*res

#using recursion 
# class Solution(object):
#     def myAtoi(self, s):
#         """
#         :type s: str
#         :rtype: int
#         """
#         s = s.strip()
#         if not s:
#             return 0

#         sign = 1
#         start_idx = 0

#         if s[0] == '-':
#             sign = -1
#             start_idx = 1
#         elif s[0] == '+':
#             start_idx = 1

#         return int(self.rec_helper(s, start_idx, 0, sign))

#     def rec_helper(self, s, index, current_res, sign):
#         if index >= len(s) or not s[index].isdigit():
#             return current_res * sign

#         digit = ord(s[index]) - ord('0')
#         current_res = current_res * 10 + digit

#         if sign == 1 and current_res > 2**31 - 1:
#             return 2**31 - 1
#         if sign == -1 and -current_res < -2**31:
#             return -2**31

#         return self.rec_helper(s, index + 1, current_res, sign)