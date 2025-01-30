def solution(numbers, num1, num2):
    length = num2 - num1 + 1
    answer = [0] * length
    
    for i in range(0, length) :
        answer[i] = numbers[num1 + i]
        
    return answer