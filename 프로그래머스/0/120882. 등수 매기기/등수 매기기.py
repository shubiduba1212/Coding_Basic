def solution(score):
    answer = []
    for i in score :
        rank = len(score)
        avg = (i[0] + i[1]) / 2
        for j in score:
            if j != i :
                compare = (j[0] + j[1]) / 2
                if compare <= avg :
                    rank -= 1
        answer.append(rank)
    return answer