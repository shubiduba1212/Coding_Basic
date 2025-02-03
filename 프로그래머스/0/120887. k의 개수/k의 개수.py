def solution(i, j, k):
    answer = 0
    
    while i <= j :
        temp = str(i)
        strK = str(k)
        for l in range(len(temp)) :
            if temp[l : l +1] == strK :
                answer += 1
        i += 1
                
    return answer