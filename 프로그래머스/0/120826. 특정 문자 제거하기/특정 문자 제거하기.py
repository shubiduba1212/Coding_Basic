def solution(my_string, letter):
    answer = ''
    tempArr = my_string.rsplit(letter)
    for i in tempArr :
        if i != "" :
            answer += i
            
    return answer