def solution(before, after):
    answer = 0
    for i in range(len(before)) :
        if before.count(after[i : i+1]) < 1 :
            answer = 0
            break
        else : 
            if before.count(after[i : i+1]) != after.count(after[i : i+1]) :
                answer = 0
                break
            else :
                answer = 1
                
    return answer