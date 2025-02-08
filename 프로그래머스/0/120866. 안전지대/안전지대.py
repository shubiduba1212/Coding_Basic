def solution(board):
    answer = 0
    position = set()
    danger = 0
    for i in range(len(board)) :
        for j in range(len(board)) :                
            if board[i][j] == 1 :
                position.add((i, j))
                for k in range(i - 1, i + 2):
                    for l in range(j - 1, j + 2):
                        if 0 <= k < len(board) and 0 <= l < len(board): 
                            position.add((k, l))
                        
                                    
    answer = (len(board) * len(board)) - len(position)         
    return answer