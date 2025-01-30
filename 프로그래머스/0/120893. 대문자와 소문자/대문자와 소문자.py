def solution(my_string):
    answer = ''
    for i in range(len(my_string)):
        if my_string[i:i+1].islower() :
            answer += my_string[i:i+1].upper()
        else :
            answer += my_string[i:i+1].lower()
    return answer