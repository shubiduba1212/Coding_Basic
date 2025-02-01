def solution(age):
    answer = ''
    tempStr = str(age)
    arr = ['a','b','c','d','e','f','g','h','i','j']
    
    for i in range(len(tempStr)) :
        for j in range(len(arr)) :
            if int(tempStr[i:i+1]) == j :                
                answer += arr[j]
        
    return answer