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

    # max_w = 0 
    # max_h = 0

    # for w, h in sizes:
    #     max_w = max(max_w, max(w, h))
    #     max_h = max(max_h, min(w, h))
    
    # answer = max_w * max_h
    
    return answer
