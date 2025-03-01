def solution(numbers):
    answer = ''
    
    # 문자열 데이터로 변환 
    str_list = list(map(str,numbers))
    
    str_list.sort(key = lambda x : x * 3 , reverse = True)
    
    answer = str(int(''.join(str_list)))
    
    return answer