def solution(my_string, num1, num2):  
    answer = ''
    
    for i in range(len(my_string)) :
        if i == num1 :            
            answer += my_string[num2:num2+1]
        elif i == num2 :
            answer += my_string[num1:num1+1]
        else :
            answer += my_string[i:i+1]
    return answer