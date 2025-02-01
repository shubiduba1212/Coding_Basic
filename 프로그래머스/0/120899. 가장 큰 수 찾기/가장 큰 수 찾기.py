def solution(array):
    answer = []
    x = array.copy()
    x.sort()
    
    for i in range(len(array)) :
        if array[i] == x[len(x) - 1] :
            answer.append(x[len(x) - 1])
            answer.append(i)
            
    return answer