def solution(n):
    answer = 0
    i = 1
    
    while i <= n :
        count = 0
        for j in range(1, i+1) :            
            if i % j == 0 :
                if count > 2 :
                    break
                count += 1
        
        if count > 2 :
            answer += 1
                        
        i += 1
            
    return answer