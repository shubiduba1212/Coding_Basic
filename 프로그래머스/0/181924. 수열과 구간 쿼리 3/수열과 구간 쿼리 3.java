class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        for(int i = 0; i < queries.length; i++){
            int temp = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = temp;
        }
        return answer;
    }
}