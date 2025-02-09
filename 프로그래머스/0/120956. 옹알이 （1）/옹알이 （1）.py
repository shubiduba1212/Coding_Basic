def solution(babbling):
    answer = 0
    arr = ["aya", "ye", "woo", "ma"]
    temp = ''
    for i in babbling :
        temp = i
        j = 0
        length = len(temp)
        while j < 4 :
            if temp.count(arr[j]) > 0 :
                length -= len(arr[j]) * (temp.count(arr[j]))
            j += 1
            
        if length == 0 :
            answer += 1
            
    return answer