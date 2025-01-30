def solution(my_string):
    answer = 0
    for i in range(len(my_string)) :
        if my_string[i:i+1].isdecimal() :
            answer += int(my_string[i:i+1])
            
    return answer