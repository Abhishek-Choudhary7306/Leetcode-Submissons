class Solution(object):
    def minimumPushes(self, word):
        """
        :type word: str
        :rtype: int
        """

        cfreq = {}

        for ch in word:
            cfreq[ch] = cfreq.get(ch,0)+1

        freq = sorted(cfreq.values(),reverse = True)

        res = 0

        for i,f in enumerate(freq):
            if i<8:
                res += f*1

            elif i<16:
                res += f*2

            elif i<24:
                res += f*3

            else :
                res += f*4

        return res


        