def solution(bin1, bin2):
    sum_num = int(bin1, 2) + int(bin2, 2)
    answer = bin(sum_num)[2:]
    return answer
