from collections import deque

def solution(bridge_length, weight, truck_weights):
    answer = 0
    queue = deque(truck_weights)
    bridge = deque([0] * bridge_length)
    cur_weight = 0
    
    while queue or cur_weight > 0:
        answer += 1
        passed = bridge.popleft()
        cur_weight -= passed
                            
        if queue and queue[0] + cur_weight <= weight :
            entered = queue.popleft()
            bridge.append(entered)
            cur_weight += entered
        else :
            bridge.append(0)
        
    return answer