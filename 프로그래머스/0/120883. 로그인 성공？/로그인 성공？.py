def solution(id_pw, db):
    answer = ''
    check_id = 0
    for i in db :        
        if i[0] == id_pw[0] :
            check_id += 1
            if i[1] == id_pw[1] :
                answer = "login"
            else :
                answer = "wrong pw"
    if check_id == 0 :
            answer = "fail"
            
    return answer