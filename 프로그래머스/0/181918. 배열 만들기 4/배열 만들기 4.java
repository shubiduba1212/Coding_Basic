class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length]; // 최대 크기를 arr.length로 설정
        int stkSize = 0; // 현재 스택 크기를 추적하는 변수

        for (int i = 0; i < arr.length; i++) {
            while (stkSize > 0 && stk[stkSize - 1] >= arr[i]) {
                stkSize--; // 스택의 마지막 원소 제거
            }
            stk[stkSize] = arr[i]; // 현재 값을 스택에 추가
            stkSize++; // 스택 크기 증가
        }

        // 결과 배열 생성
        int[] result = new int[stkSize];
        for (int i = 0; i < stkSize; i++) {
            result[i] = stk[i];
        }

        return result;
    }
}