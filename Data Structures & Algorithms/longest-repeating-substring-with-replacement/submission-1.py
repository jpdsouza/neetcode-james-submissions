class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        n = len(s)
        l = 0
        counter = defaultdict(int)
        res = 0

        for r in range(n):
            counter[s[r]] += 1
            while (r - l + 1) - max(counter.values()) > k:
                counter[s[l]] -= 1
                l += 1

            res = max(res, r - l + 1)
        return res
        