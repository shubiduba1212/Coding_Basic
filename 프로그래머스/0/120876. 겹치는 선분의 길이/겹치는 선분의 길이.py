def solution(lines):
    answer = 0
    position = []

    for i in range(len(lines) - 1):
        for j in range(i + 1, len(lines)):
            first = max(lines[i][0], lines[j][0])
            second = min(lines[i][1], lines[j][1])

            if first < second:  
                position.append([first, second])

    
    position.sort()
    merged_intervals = []
    
    for start, end in position:
        if merged_intervals and merged_intervals[-1][1] >= start:  
            merged_intervals[-1][1] = max(merged_intervals[-1][1], end)
        else:
            merged_intervals.append([start, end])

    answer = sum(end - start for start, end in merged_intervals)

    return answer
