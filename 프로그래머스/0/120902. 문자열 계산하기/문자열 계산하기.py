def solution(my_string):
    arr = my_string.split(" ")
    answer = int(arr[0])
    
    for i in range(1, len(arr), 2) :        
        num = int(arr[i + 1])
        if arr[i] == "+":
            answer += num
        elif arr[i] == "-" :
            answer -= num
        
    return answer