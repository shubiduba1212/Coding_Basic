def solution(n):
    answer = []
    divider = 2
    
    while n > 1 :
        while n % divider == 0 :
            if answer.count(divider) < 1 :
                answer.append(divider)
            n //= divider
        divider += 1
        
        if divider * divider > n:
            if n > 1:
                answer.append(n)
            break        
        
    return answer