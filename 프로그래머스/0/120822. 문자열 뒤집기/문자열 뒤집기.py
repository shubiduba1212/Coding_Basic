def solution(my_string):
    answer = ''
    i = -1
    while i >= -(len(my_string)) :
        if i == -1 :
             answer += my_string[i : ]
             #print(my_string[i : ])
        else : 
             answer += my_string[i : i + 1]                
        #print(my_string[i : i + 1])
        #print(answer)
        i += -1
        
    return answer