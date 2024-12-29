class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        int length = 0;
        for(int i = 0; i < flag.length; i++){
            if(flag[i] == true){                
                int[] tempArr = new int[length + (arr[i] * 2)];
                
                if(answer.length == 0){
                    int addedNum = arr[i];
                    for(int j = 0; j < length + (arr[i] * 2); j++){
                        tempArr[j] = addedNum; 
                    }
                }else{
                    for(int j = 0; j < length; j++){
                        tempArr[j] = answer[j]; 
                    }
                    for(int j = length; j < length + (arr[i] * 2); j++){
                        int addedNum = arr[i];
                        tempArr[j] = addedNum; 
                    }                    
                }
                length += (arr[i] * 2);
                answer = tempArr;
            }else{
                length -= arr[i];
                int[] tempArr = new int[length];
                for(int j = 0; j < length; j++){
                    tempArr[j] = answer[j]; 
                }                
                answer = tempArr;
            }
        }
        return answer;
    }
}
