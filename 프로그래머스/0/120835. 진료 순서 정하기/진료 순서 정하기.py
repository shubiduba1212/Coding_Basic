def solution(emergency):
    answer = []
    
    for i in range(len(emergency)) :
        order = 1
        for j in range(len(emergency)) :
            if emergency[i] < emergency[j] :
                order += 1
        answer.append(order)        
        
    return answer