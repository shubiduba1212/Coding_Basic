import math

def solution(numer1, denom1, numer2, denom2):
    answer = []
    
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a

    def lcm(a, b):
        return abs(a * b) // gcd(a, b)
    
    cm = lcm(denom1, denom2)
    
    numer1 *= (cm / denom1)
    numer2 *= (cm / denom2)
    
    cd = gcd((numer1 + numer2), cm)
    
    answer = [int((numer1 + numer2) / cd), int(cm / cd)]
    
    return answer