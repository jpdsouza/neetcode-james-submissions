class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        lenS2 = len(s2)
        lenS1 = len(s1)
        if lenS1 > lenS2:
            return False
        counterS1 = Counter(s1) 
        l = 0
        r = lenS1 - 1

        while r < lenS2:
            if counterS1 == Counter(s2[l:r+1]):
                return True
            l += 1
            r += 1
        return False
