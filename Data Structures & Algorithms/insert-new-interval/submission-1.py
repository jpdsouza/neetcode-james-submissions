class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        res = []
        newStart, newEnd = newInterval

        for i in range(len(intervals)):
            start, end = intervals[i]

            if newEnd < start:
                res.append([newStart, newEnd])
                return res + intervals[i:]

            elif newStart > end: 
                res.append([start, end])
                
            else:                
                newStart = min(newStart, start)
                newEnd = max(newEnd, end)
        
        res.append([newStart, newEnd])
        return res