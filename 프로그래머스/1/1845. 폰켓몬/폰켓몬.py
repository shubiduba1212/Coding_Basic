def solution(nums):
    answer = 0
    tempDict = {}
    for i in nums :
        tempDict[i] = tempDict.get(i, 0) + 1
    
    types = len(tempDict)
    count = len(nums)
    available = count / 2
    
    if types >= available :
        answer = available
    elif types < available :
        answer = types
    
    return answer