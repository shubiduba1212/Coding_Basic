class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        answer = new int[2 + (intervals[0][1] - intervals[0][0]) + (intervals[1][1] - intervals[1][0])];
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 0; i < (intervals[0][1] - intervals[0][0] + 1); i++){
            answer[i] = arr[start];
            start++;
        }
        start = intervals[1][0];
        for(int i = 0; i < (intervals[1][1] - intervals[1][0] + 1); i++){            
            answer[(intervals[0][1] - intervals[0][0] + 1) + i] = arr[start];
            start++;
        }
        return answer;
    }
}