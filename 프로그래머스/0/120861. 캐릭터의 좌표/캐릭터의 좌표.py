def solution(keyinput, board):
    answer = []
    vertical = 0
    horizon = 0
    for i in keyinput :        
        if i == "left" :
            temp = horizon - 1
            horizon = temp if abs(temp) <= board[0] // 2 else temp + 1
        elif i == "right" :
            temp = horizon + 1
            horizon = temp if temp <= board[0] // 2 else temp - 1
        elif i == "up" :
            temp = vertical + 1
            vertical = temp if temp <= board[1] // 2 else temp - 1
        else :
            temp = vertical - 1
            vertical = temp if abs(temp) <= board[1] // 2 else temp + 1
    answer.append(horizon)
    answer.append(vertical)
    return answer