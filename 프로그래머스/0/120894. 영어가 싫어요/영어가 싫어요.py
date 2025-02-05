def solution(numbers):
    answer = 0
    alphabetArr = ["zero","one", "two", "three", "four", "five", "six","seven","eight", "nine"]
    tempStr = numbers
    i = 0
    while i < 10 :
        temp = str(i)
        if numbers.count(alphabetArr[i]) > 0 :            
            tempStr = tempStr.replace(alphabetArr[i], temp)
        i += 1
    answer = int(tempStr)
    return answer