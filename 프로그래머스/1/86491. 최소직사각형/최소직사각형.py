def solution(sizes):
    answer = 0
    first = []
    second = []
    
    for i in sizes :
        i.sort()
        first.append(i[0])
        second.append(i[1])
    
    first.sort(reverse=True)
    second.sort(reverse=True)
    
    answer = first[0] * second[0]
    
    return answer