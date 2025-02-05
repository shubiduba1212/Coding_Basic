def solution(my_str, n):
    answer = []
    i = 0
    while i < len(my_str) :
        if len(my_str[i : len(my_str)]) > n :
            answer.append(my_str[i : i + n])
            i += n
        else : 
            answer.append(my_str[i : len(my_str)])
            break
        
    return answer