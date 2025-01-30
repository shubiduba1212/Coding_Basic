def solution(num_list):    
    even = 0;
    odd = 0;    
    answer = [even, odd]
    
    for i in num_list :
        if i % 2 == 0 :
            answer[0] += 1
        else :
            answer[1] += 1
            
    return answer