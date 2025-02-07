def solution(polynomial):
    answer = ''
    arr = polynomial.split(" + ")
    print(arr)
    temp = 0 
    num = 0
    for i in arr :
        if i.count("x") > 0 :
            if len(i) > 1 :
                sepStr = i.split("x")
                print()
                temp += int(sepStr[0])
            else : 
                temp += 1
        else :
            num += int(i)
    if temp == 0 :
        answer = str(num)
    elif num == 0 :
        if temp == 1 :
            answer = "x"
        else :
            answer = str(temp)+"x"
    elif temp == 1 :
        if num == 0 :
            answer = "x"
        else:
            answer = "x + "+ str(num)
    else :
        answer = str(temp)+"x"+" + "+ str(num)
    return answer