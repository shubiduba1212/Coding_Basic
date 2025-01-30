def solution(n):
    answer = 0
    tempStr = str(n)
    for i in range(len(tempStr)) :
        answer += int(tempStr[i : i+1])
    
    return answer