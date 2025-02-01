def solution(my_string):
    answer = []
    
    for i in range(len(my_string)) :
        for j in range(0, 10) :
            if my_string[i : i+1] == str(j) :
                answer.append(int(my_string[i : i+1]))
    answer.sort()        
    return answer