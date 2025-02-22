def solution(clothes):
    answer = 1
    temp = {}
    
    for i in clothes :
        temp[i[1]] = temp.get(i[1], 0) + 1
        
    for count in temp.values() :
        answer *= (count + 1)
        
    answer -= 1
    
    return answer