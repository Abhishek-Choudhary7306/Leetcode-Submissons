#better Solution
class Solution(object):
    def sumAndMultiply(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 0:
            return 0

        digit_sum = 0
        concat = 0
        place = 1

        while n > 0:
            digit = n % 10
            digit_sum += digit

            if digit != 0:
                concat = digit * place + concat
                place *= 10

            n //= 10

        return concat * digit_sum

# class Solution(object):
#     def sumAndMultiply(self, n):
#         """
#         :type n: int
#         :rtype: int
#         """
#         num = str(n)
#         res = ""
#         digitsum = 0

#         for i in num:
#             digit = int(i)
#             digitsum += digit

#             if digit!=0:
#                 res+=i  

#         if res=="":
#             return 0

#         return int(res)*digitsum
