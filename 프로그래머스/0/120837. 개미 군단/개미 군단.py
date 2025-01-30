def solution(hp):
    answer = 0
    
    while hp > 0:
        if hp // 5 >= 1 :
            answer += int(hp // 5)
            hp %= 5
            
        elif hp // 3 >= 1 :
            answer += int(hp // 3)
            hp %= 3
            
        else :
            answer += hp // 1
            hp %= 1
        
    return answer