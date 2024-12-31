class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0]; // 0, 0, 0
            int e = queries[i][1]; // 4, 3, 3
            int k = queries[i][2]; // 1, 2, 3
            
            for(int j = s; j <= e; j++){
                if(j % k == 0){
                    arr[j]++;
                    System.out.println(arr[j]);
                }
            }
        }
        return answer=arr;
    }
}