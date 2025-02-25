def solution(array, commands):
    answer = []
    
    for i in commands :
        # print(array[(i[0] - 1) : (i[1])])
        temp = array[(i[0] - 1) : (i[1])]
        temp.sort()
        answer.append(temp[(i[2] - 1)])
        
    return answer