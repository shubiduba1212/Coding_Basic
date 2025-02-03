def solution(s):
    answer = 0
    arr = s.split(" ")
    
    for i in range(len(arr)) :
        if arr[i] == "Z" :
            temp = int(arr[i - 1])
            answer -= temp
        else : 
            temp = int(arr[i])
            answer += temp
        
    return answer