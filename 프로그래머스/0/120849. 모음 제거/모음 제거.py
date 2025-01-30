def solution(my_string):
    answer = ''
    arr = ["a","e","i","o","u"]
    for i in range(len(my_string)) :
        check = False
        for j in arr :            
            if my_string[i : i+1] == j :
                check = True
                break
            elif my_string[i : i+1] == " ":
                #print(my_string[i : i+1])
                break
            else :
                #print(my_string[i : i+1])
                check = False
                
        if check == False :
            answer += my_string[i : i+1]
            
    return answer