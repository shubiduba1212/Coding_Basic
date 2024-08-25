class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        int length = arr.length;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    length--;
                    arr[i] = 0;
                }else{
                    arr[i] = arr[i];
                }
            }
        }
        answer = new int[length];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        
        return answer;
    }
}