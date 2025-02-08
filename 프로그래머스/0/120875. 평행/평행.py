def solution(dots):
    answer = 0
    
    def is_parallel(a, b, c, d):
        return (dots[b][1] - dots[a][1]) * (dots[d][0] - dots[c][0]) == (dots[d][1] - dots[c][1]) * (dots[b][0] - dots[a][0])

    # 3가지 경우 중 하나라도 평행하면 1 반환
    if is_parallel(0, 1, 2, 3) or is_parallel(0, 2, 1, 3) or is_parallel(0, 3, 1, 2):
        answer = 1
    return answer