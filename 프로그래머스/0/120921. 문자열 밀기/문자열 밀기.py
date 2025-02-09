def solution(A, B):
    answer = 0
    temp = A
    
    while answer < len(A):
        if temp == B :            
            break
        else:
            char = temp[len(temp) - 1 : len(temp)]
            rest = temp[0:len(temp) - 1]
            temp = char + rest
            answer += 1
            
           
    if answer == len(A) :
        answer = -1
    
    return answer