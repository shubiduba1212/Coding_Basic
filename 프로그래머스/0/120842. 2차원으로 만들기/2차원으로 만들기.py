def solution(num_list, n):
    answer = [[] for _ in range(len(num_list) // n)]
    for i in range(0, len(num_list), n) : 
        idx = 0
        for j in range(i, n+i) : 
            answer[i // n].append(num_list[j])
            idx += 1
        
    return answer