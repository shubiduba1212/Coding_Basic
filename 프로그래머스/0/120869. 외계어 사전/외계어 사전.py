def solution(spell, dic):
    answer = 0
    for i in dic :
        count = 0
        for j in spell :
            if i.count(j) > 0 :
                count += 1
        if count == len(spell) :
            answer += 1
    
    if answer == 0 :
        answer = 2
            
    return answer