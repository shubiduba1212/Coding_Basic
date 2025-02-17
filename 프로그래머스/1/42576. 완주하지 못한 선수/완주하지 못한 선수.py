def solution(participant, completion):
    answer = ''
    partDict = {}
    for i in participant :
        partDict[i] = partDict.get(i, 0) + 1
        
    for i in completion :
        partDict[i] = partDict.get(i, 0) - 1
        if partDict[i] == 0 :
            partDict.pop(i)
    
    answer = next(iter(partDict))
                
    return answer
