def solution(n):
    answer = 0
    i = 1
    while i < n + 1 :
        answer += 1
        
        while answer % 3 == 0 or '3' in str(answer) :
            answer += 1
            
        i += 1                
            
    return answer