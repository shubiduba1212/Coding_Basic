def solution(price):
    answer = price if price < 100000 else int(price * 0.95) if 300000 > price >= 100000 else int(price * 0.90) if 500000 > price >= 300000 else int(price * 0.80)
    return answer