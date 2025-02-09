def solution(numlist, n):
    answer = []
    gap = []
    # numlist.remove(n)
    numlist.sort()
    for i in numlist :
        temp = abs(n - i)
        gap.append([temp,[i]])
        for j in numlist :
            if temp == abs(n - j) and gap[len(gap) - 1][1].count(j) == 0:
                gap[len(gap) - 1][1].append(j)
                numlist.remove(j)
                    
    gap.sort()
    
    for i in gap :
        if len(i[1]) > 1 :
            i[1].sort(reverse = True)
            answer.append(i[1][0])
            answer.append(i[1][1])
        else :
            answer.append(i[1][0])
    return answer