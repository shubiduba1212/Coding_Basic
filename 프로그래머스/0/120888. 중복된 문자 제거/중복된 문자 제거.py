def solution(my_string):
    answer = ''
    
    for i in range(len(my_string)) :    
        if my_string[i:i+1] == "0" :
            continue
        else :
            answer += my_string[i:i+1]
            if my_string.count(my_string[i:i+1]) > 1 :
                my_string = my_string.replace(my_string[i:i+1], "0")     
                
    return answer