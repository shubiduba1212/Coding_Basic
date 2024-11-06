class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int compare = queries[i][2];
            int minNum = 1000000;
            boolean check = false;
            
            for(int j = start; j <= end; j++){
                if(arr[j] > compare && arr[j] < minNum){
                    minNum = arr[j];
                    check = true;
                }
            }
            
            answer[i] = check ? minNum : -1;
        }
        
        return answer;
    }
}
