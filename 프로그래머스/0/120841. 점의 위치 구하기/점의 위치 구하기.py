def solution(dot):
    answer = 1 if dot[0] > 0 and dot[1] > 0 else 2 if dot[0] < 0 and dot[1] > 0 else 3 if dot[0] < 0 and dot[1] < 0 else 4
    return answer