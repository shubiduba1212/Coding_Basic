def solution(common):
    answer = 0
    gap = 0
    
    if common[1] - common[0] == common[2] - common[1] :
        answer = common[len(common) - 1] + (common[1] - common[0])
        # if gap == 0 :
        #     gap = common[i + 1] - common[i]
        # else :
        #     if gap != 
    else :
        answer = common[len(common) - 1] * (common[1] / common[0])
    return answer