from collections import deque

def solution(progresses, speeds):
    answer = []
    queue = deque()
    
    for p, s in zip(progresses, speeds):
        days = (100 - p) // s + (1 if (100 - p) % s > 0 else 0)
        queue.append(days)
    
    while queue :
        day = queue.popleft()
        count = 1
        
        while queue and queue[0] <= day :
            queue.popleft()
            count += 1
        
        answer.append(count)
    
    return answer