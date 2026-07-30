class Solution(object):
    def minimumPushes(self, word):
        """
        :type word: str
        :rtype: int
        """

        if len(word)<=8:
            return len(word)

        if len(word)<=16:
            return 8 + 2*(len(word)-8)

        if len(word)<=24:
            return 24 + 3*(len(word)-16)

        if len(word)<=26:
            return 48 + 4*(len(word)-24)


