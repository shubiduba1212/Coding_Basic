def solution(dots):
    dots.sort()
    answer = (dots[1][1] - dots[0][1]) * (dots[2][0] - dots[1][0])        
    return answer