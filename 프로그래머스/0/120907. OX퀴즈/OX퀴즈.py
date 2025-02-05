def solution(quiz):
    answer = []
    tempArr = []
    for i in quiz :
        mod = i.split(" ")
        first = int(mod[0])
        second = int(mod[2])
        result = int(mod[len(mod) - 1])
        if mod[1] == "+" :
            answer.append("O") if first + second == result else answer.append("X")
        else :
            answer.append("O") if first - second == result else answer.append("X")
            
    return answer