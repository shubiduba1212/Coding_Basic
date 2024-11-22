class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[arr.length];
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            //System.out.println("start : "+start);
            //System.out.println("end : "+end);
            
            for(int j = start; j <= end; j++){
                arr[j] = arr[j]+1;
            }            
            
        }
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
