def solution(answers):
    giveUps = [
        [1, 2, 3, 4, 5], 
        [2, 1, 2, 3, 2, 4, 2, 5], 
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ]
    
    scores = [0, 0, 0]

    for idx, ans in enumerate(answers):
        for i in range(3):  
            if giveUps[i][idx % len(giveUps[i])] == ans:
                scores[i] += 1
    
    max_score = max(scores)    

    result = [i + 1 for i, score in enumerate(scores) if score == max_score]

    return result