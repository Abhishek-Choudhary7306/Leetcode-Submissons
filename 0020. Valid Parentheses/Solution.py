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
