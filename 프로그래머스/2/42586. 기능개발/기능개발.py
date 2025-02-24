from collections import deque

def solution(progresses, speeds):
    answer = []
    temp = []
    for i in range(len(progresses)) :
        rest = ((100 - progresses[i]) // speeds[i]) + 1 if (100 - progresses[i]) % speeds[i] > 0 else (100 - progresses[i]) // speeds[i]
        temp.append(rest)
    
    length = len(temp)
    count = 0
    date = temp[0]
    for i in range(length) :                
        if temp[i] <= date : # 앞 기능의 작업 완료일보다 짧거나 같은 경우
            count += 1
        else : 
            answer.append(count)
            count = 0
            count += 1
            date = temp[i]
            print(date)
        
        if i == length - 1 :
            answer.append(count)

    
    queue = deque()
    
    # for p, s in zip(progresses, speeds):
    #     days = (100 - p) // s + (1 if (100 - p) % s > 0 else 0)
    #     queue.append(days)
    
    # while queue :
    #     day = queue.popleft()
    #     count = 1
        
    #     while queue and queue[0] <= day :
    #         queue.popleft()
    #         count += 1
        
    #     answer.append(count)
    
    return answer
