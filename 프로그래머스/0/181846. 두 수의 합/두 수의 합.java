// 처음에 Integer.parseInt() 사용했으나, 
// Exception in thread "main" java.lang.NumberFormatException: For input string: "18446744073709551615" at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
// 에러발생
// int: 범위는 -2^31 ~ 2^31-1 (-2,147,483,648 ~ 2,147,483,647)
// long: 범위는 -2^63 ~ 2^63-1 (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
// "18446744073709551615" 숫자 데이터 길이가 기존 사용하던 int, long 타입의 범위를 초과했기 때문에 에러 발생
// BigInteger는 Java에서 매우 큰 숫자를 다룰 수 있는 클래스
// BigInteger는 숫자의 범위 제한이 없으므로, 메모리가 허용하는 한에서 아주 큰 숫자도 처리할 수 있다


import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);
        return answer = String.valueOf(sum);
    }
}
