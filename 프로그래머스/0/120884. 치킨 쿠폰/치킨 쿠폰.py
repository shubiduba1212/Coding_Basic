def solution(chicken):
    answer = 0
    
    while chicken >= 10 :
        
        if chicken % 10 == 0 :
            answer += chicken // 10
            chicken //= 10
        else :
            answer += chicken // 10
            chicken = (chicken // 10) + (chicken % 10)
        
    return answer