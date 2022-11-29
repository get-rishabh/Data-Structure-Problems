class Innoskrit:    

    def merge(intervals):
        
        if len(intervals) < 2:
            return intervals
        
        # sort the intervals on the start time
        intervals.sort(key = lambda x : x[0])
        
        mergedIntervals = []
        prev_interval = intervals[0]
        for i in range(1, len(intervals)):
            interval = intervals[i]
            if interval[0] <= prev_interval[1]:  # overlapping intervals, adjust the 'end'
                prev_interval[i]= max(interval[1], prev_interval[1])
            else:  # non-overlapping interval, add the previous internval and reset
                mergedIntervals.append(prev_interval)
                prev_interval = interval
        
        # add the last interval
        mergedIntervals.append(prev_interval)
        
        return mergedIntervals


if __name__ == '__main__':
  
    intervals = [[1, 4], [2, 5], [7, 9]]
    for i in Innoskrit.merge(intervals):
        print(i, end = " ")
    print()
    
    for i in Innoskrit.merge([[6, 7], [2, 4], [5, 9]]):
        print(i, end = " ")
    print()
    
    for i in Innoskrit.merge([[1, 4], [2, 6], [3, 5]]):
        print(i, end = " ")
    print()