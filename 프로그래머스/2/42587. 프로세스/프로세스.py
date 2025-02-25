from collections import deque

def solution(priorities, location):
    answer = 0
    queue = deque(enumerate(priorities))
    
    while queue :
        current = queue.popleft()
        
        if any(current[1] < p[1] for p in queue) :            
            queue.append(current)
        else :
            answer += 1
            if current[0] == location :
                break    
    
    return answer