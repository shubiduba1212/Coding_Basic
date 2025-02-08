def solution(a, b):
    answer = 0
    
    def gcd(i, j) :
        while j :
            i, j = j, i % j
        return i
    
    num = b // gcd(a, b)
    
    divider = 2  
    while num > 1 : 
        if divider != 2 and divider != 5 :
            answer = 2
            break

        while num % divider == 0 :
            num //= divider
        divider += 3     
            
    if answer == 0 :
        answer = 1
        
    return answer