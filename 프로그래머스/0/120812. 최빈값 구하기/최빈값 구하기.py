def solution(array):
    array.sort()
    answer = 0
    count = 0
    sameCount = 0
    isMore = False
    
    for i in range(len(array)) :
        tempCount = array.count(array[i])
        
        if i == 0 :
            answer = array[i]
            count = tempCount
            #print(f"{array[i]}의 빈값은 : {tempCount}")
        else :
            if array[i] != array[i-1] and tempCount > count : #이전에 나온 숫자가 아니고, 기존 최빈값보다 높은 경우
                answer = array[i]
                count = tempCount
                isMore = False
                #print(f"{array[i]}의 빈값은 : {tempCount}")
                
            elif array[i] != array[i-1] and tempCount == count :
                isMore = True
                #print(f"{array[i]}의 빈값은 : {tempCount}")
        
    if isMore == False :
        return answer
    else :
        return -1