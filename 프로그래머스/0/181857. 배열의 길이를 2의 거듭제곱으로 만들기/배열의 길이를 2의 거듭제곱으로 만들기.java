class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int arrLength = arr.length;
        int length = 1;
        
        while(length < arrLength){
            length *= 2;
        }
        
        if(arrLength == length){
            return arr;
        }
        
        answer = new int[length]; 
        for(int i = 0; i < length; i++){
            if(i >= arr.length){
                answer[i] = 0;
            }else{
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
