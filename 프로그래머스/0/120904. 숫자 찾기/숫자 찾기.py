def solution(num, k):
    answer = 0
    temp = str(num)
    
    for i in range(len(temp)) :
        if int(temp[i : i + 1]) == k :
            answer = i + 1
            break
    
    if answer == 0 :
        answer = -1
    
    return answer