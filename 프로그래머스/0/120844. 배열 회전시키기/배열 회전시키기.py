def solution(numbers, direction):
    answer = numbers.copy()
    
    if direction == "right" :
        temp = answer[len(answer) - 1]
        answer.pop()
        answer.insert(0, temp)
    else :
        temp = answer[0]
        answer.remove(temp)
        answer.append(temp)
        
    return answer