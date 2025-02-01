def solution(balls, share):
    def factorial(num) :
        sumNum = 1
        while num > 0 :
            sumNum *= num
            num -= 1
        return sumNum
    
    answer = factorial(balls) / (factorial(balls - share) * factorial(share))
    
    return answer