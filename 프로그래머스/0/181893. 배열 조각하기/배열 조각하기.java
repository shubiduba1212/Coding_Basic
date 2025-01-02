class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                int[] tempArr = new int[query[i] + 1];
                for(int j = 0; j < tempArr.length; j++){
                    tempArr[j] = arr[j];
                    // System.out.println(tempArr[j]);
                }
                arr = tempArr;
            }else{ // 홀수 인덱스라면
                int[] tempArr = new int[arr.length - query[i]];
                for(int j = 0; j < tempArr.length; j++){
                    tempArr[j] = arr[j + query[i]];
                    // System.out.println(tempArr[j]);
                }
                arr = tempArr;
            }
        }
        
        return arr;
    
    }
}
