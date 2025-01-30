def solution(n):
    answer = 0
    i = 1
    while i * i <= n:  
        if n % i == 0:  
            answer += 1  
            if i != n // i:  
                answer += 1  
        i += 1  
        
    return answer