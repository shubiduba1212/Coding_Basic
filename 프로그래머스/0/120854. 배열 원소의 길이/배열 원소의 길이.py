def solution(strlist):
    answer = strlist.copy()
    for i in range(len(strlist)) :
        answer[i] = len(strlist[i])
        
    return answer