def solution(sides):
    answer = 0
    sides.sort()
    
    if sides[1] - sides[0] == 1 :
        answer = 1
    else :
        for i in range((sides[1] + 1) - sides[0] ,(sides[1] + 1)) :
            # print(f"가장 긴 변 : {sides[1]} 일때 : {i}")
            answer += 1

        for i in range(sides[1] + 1, (sides[0] + sides[1])) :
            # print(f"가장 긴 변 : {sides[0] + sides[1]} 보다 작을때 : {i}")
            answer += 1
            
    return answer