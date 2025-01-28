def solution(numbers):
    answer = numbers.copy()
    
    for i in range(len(answer)):
        answer[i] = answer[i] * 2
        
    return answer