def solution(array, n):
    answer = 0
    array.sort()
    gap = 100
    for i in array :
        # print(f"gap : {gap}")
        # print(f"answer :{answer}") 
        # print(f"i :{i}")
        if gap == 100 :
            gap = n - i
            answer = i
        
        elif abs(gap) > abs(n - i) :
            gap = n - i
            answer = i                
        
        if i == n :
            answer = i
    
    return answer