def solution(n):
    answer = []
    divider = 1
    
    while divider <= n // divider :
        if n % divider == 0 :
            if divider == n // divider :
                answer.append(divider)
            else :
                answer.append(divider)
                answer.append(n // divider)
        divider += 1
    
    answer.sort()
    print(answer)
    return answer