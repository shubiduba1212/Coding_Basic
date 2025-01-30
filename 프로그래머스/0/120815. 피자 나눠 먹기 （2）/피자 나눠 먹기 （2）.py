def solution(n):
    if n % 6 == 0 :
        answer = n / 6
    else :
        num1 = 6
        num2 = n
        while num2:            
            num1, num2 = num2, num1 % num2
        
        gcd = num1
        answer = ((n * 6) // gcd) / 6
            
    return answer