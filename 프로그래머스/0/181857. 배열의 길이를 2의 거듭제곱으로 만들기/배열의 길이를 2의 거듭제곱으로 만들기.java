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

        // for (int i = 0; i < 2000; i++) {                
        //     length *= 2;
        //     //System.out.println(length);
        //     if(arrLength == length){
        //         answer = arr;
        //         break;
        //     }else if(arr.length < length){
        //         //System.out.println(length);
        //         answer = new int[length]; 
        //         for(int j = 0; j < length; j++){
        //             if(j >= arr.length){
        //                 answer[j] = 0;
        //             }else{
        //                 answer[j] = arr[j];
        //             }
        //         }
        //         break;
        //         }
        //     }
        return answer;
    }
}
