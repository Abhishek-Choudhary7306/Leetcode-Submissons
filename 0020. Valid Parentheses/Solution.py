class Solution(object):
    def isValid(self, s):
        st = []
        mp = {')':'(', '}':'{', ']':'['}

        for ch in s:
            if ch in mp:
                if not st or st.pop() != mp[ch]:
                    return False
            else:
                st.append(ch)

        return not st


#alternate solution

# class Solution(object):
#     def isValid(self, s):
#         st = []

#         for e in s:
#             if e == '(' or e == '{' or e == '[':
#                 st.append(e)
#             else:
#                 if not st:
#                     return False

#                 c = st.pop()

#                 if (e == ')' and c != '(') or (e == '}' and c != '{') or (e == ']' and c != '['):
#                     return False

#         return len(st) == 0


