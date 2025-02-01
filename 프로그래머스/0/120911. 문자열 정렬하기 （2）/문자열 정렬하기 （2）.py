def solution(my_string):
    answer = ''
    temp = []
    strLower = my_string.lower()
    
    for i in range(len(strLower)) :
        temp.append((strLower[i:i+1]))
    
    temp.sort()
    
    for i in range(len(temp)):
        answer += temp[i]
    
    return answer