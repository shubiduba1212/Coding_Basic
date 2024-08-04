class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int length = n / k;
        answer = new int[length];
        for(int i = 0; i < length; i++){
            answer[i] = (i + 1) * k; 
        }
        return answer;
    }
}