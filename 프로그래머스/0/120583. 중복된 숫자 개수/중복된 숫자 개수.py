def solution(array, n):
    answer = 0
    array.sort()
    for i in array :
        if i == n :
            answer += 1
        elif i > n :
            break
            
    return answer