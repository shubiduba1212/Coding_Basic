def solution(my_string):
    answer = 0
    temp = ""
    for i in range(len(my_string)) :
        if my_string[i:i+1].isdecimal() == False :
            temp += "_"
        else :
            temp += my_string[i:i+1]
    splitArr = temp.split("_")
    
    for i in splitArr :
        if i != "" :
            temp = int(i)
            answer += temp
                                    
    return answer