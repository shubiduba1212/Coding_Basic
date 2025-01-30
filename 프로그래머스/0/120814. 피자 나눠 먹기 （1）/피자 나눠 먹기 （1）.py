def solution(n):
    # if n % 7 == 0 :
    #     answer = n / 7
    # else :
    #     if n < 7 :
    #         answer = 1
    #     else :
    #         answer = int(n / 7) + 1
    
    answer = n / 7 if n % 7 == 0 else 1 if n < 7 else int(n / 7) + 1
    return answer