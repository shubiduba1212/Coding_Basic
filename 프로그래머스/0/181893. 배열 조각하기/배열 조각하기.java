class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){ 
                int[] tempArr = new int[query[i] + 1];
                for(int j = 0; j < tempArr.length; j++){
                    tempArr[j] = arr[j];
                }
                arr = tempArr;
            }else{ 
                int[] tempArr = new int[arr.length - query[i]];
                startIdx = query[i];
                for(int j = 0; j < tempArr.length; j++){
                    tempArr[j] = arr[j + query[i]];
                }
                arr = tempArr;
            }
        }
        
        return arr;
    
    }
}
