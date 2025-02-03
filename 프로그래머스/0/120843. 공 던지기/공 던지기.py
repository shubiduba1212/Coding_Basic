def solution(numbers, k):
    answer = 0
    idx = 0 # 0, 2, 4...
    
    while k > 1 :
        print(idx)
        if idx+2 >= len(numbers) :
            idx = (idx + 2) - len(numbers)
        else :
            idx += 2
        k -= 1        
            
    answer = numbers[idx]
    
    return answer