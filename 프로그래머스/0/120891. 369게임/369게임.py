def solution(order):
    answer = 0
    temp = str(order)
    for i in range(len(temp)) :
        if int(temp[i : i+1]) % 3 == 0 and int(temp[i : i+1]) != 0 :
            answer += 1
            
    return answer