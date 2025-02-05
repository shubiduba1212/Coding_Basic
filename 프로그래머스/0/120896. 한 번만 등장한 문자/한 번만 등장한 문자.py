def solution(s):
    answer = ''
    temp = []
    
    for i in range(len(s)) :
        if s.count(s[i : i + 1]) == 1 :
            temp.append(s[i : i + 1])

    temp.sort()
    
    for i in temp :
        answer += i
        
    return answer