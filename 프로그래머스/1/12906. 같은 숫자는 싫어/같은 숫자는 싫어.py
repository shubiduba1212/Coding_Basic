def solution(arr):
    answer = []
    temp = 10
    for i in range(len(arr)) :        
        if arr[i] != temp :
            answer.append(arr[i])
            temp = arr[i]
            
    # for i in arr :        
    #     if not answer or answer[-1] != i :
    #         answer.append(i)
    return answer
