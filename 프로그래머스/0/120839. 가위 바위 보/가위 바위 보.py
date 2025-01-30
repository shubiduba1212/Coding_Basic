def solution(rsp):
    answer = ''
    for i in range(len(rsp)) :
        answer += "2" if rsp[i:i+1] == "5" else "0" if rsp[i:i+1] == "2" else "5"
        
    return answer