class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[n];
        int idx = 0;
        for(int i = 0; i < (n == 1 ? 1 : n); i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}