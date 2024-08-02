class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int length = num_list.length - n == 0 ? 1 : num_list.length - n + 1;
        answer = new int[length];
        int idx = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i >= n - 1 ){
                answer[idx] = num_list[i];
                idx++;
            }
        }
        return answer;
    }
}