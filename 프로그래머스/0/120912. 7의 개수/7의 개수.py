def solution(array):
    answer = 0
    
    for i in array :
        temp = str(i)
        for j in range(len(temp)) :
            if temp[j : j+1] == "7" :
                answer += 1
            
    return answer