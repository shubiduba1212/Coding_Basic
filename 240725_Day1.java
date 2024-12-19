// 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

// isUpperCase 또는 isLowerCase를 사용해야한다고 생각했지만, arr[i]에 직접 사용하자  
// char cannot be dereferenced 컴파일에러가 발생
// 에러 발생 이유 - 기본 데이터 타입(primitive type)과 참조 타입(reference type) 간에 중요한 차이 이해 부족
// 1. 기본 데이터 타입(Primitive Type)
// char, int, float, boolean 등은 기본 데이터 타입으로, 메모리의 스택에 직접 값을 저장한다. 
// 이 타입들은 메서드나 필드를 가지지 않으며, 오직 값을 표현하기 위해 존재한다.
// 2. 참조 타입(Reference Type)
// String, Character, Integer 등은 참조 타입으로, 힙 메모리에 객체를 저장하고 해당 객체를 참조하는 참조값을 스택에 저장한다. 
// 이 객체들은 메서드와 필드를 가지며, 이를 통해 다양한 동작을 수행할 수 있다. 
// Character.isUpperCase(char c)와 같은 메서드는 Character 클래스의 정적 메서드로, 기본 데이터 타입인 char를 매개변수로 받아 그 문자가 대문자인지 확인한다.

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray(); 
        for(int i = 0; i < arr.length; i++){ 
            char compareChar = arr[i]; 
            if(Character.isUpperCase(compareChar)){ 
                compareChar = Character.toLowerCase(compareChar);
            }else{
                compareChar = Character.toUpperCase(compareChar);
            }
        }
    }
}
