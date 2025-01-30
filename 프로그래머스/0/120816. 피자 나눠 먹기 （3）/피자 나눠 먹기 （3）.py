def solution(slice, n):
    if n % slice == 0 :
        answer = n / slice
    elif n > slice :
        answer = int(n / slice) + 1
    else :
        answer = 1
    return answer