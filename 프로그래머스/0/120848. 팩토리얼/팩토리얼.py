def solution(n):
    answer = 1
    facNum = 1
    
    while facNum < n :    
        answer += 1    
        facNum *= answer   
    
    if facNum != n :
        answer -= 1
        
    return answer
