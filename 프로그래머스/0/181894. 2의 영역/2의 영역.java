class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int startIdx = 100001;
        int endIdx = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2 && startIdx == 100001){
                startIdx = i;
            }else if(arr[i] == 2 && startIdx != 100001){
                endIdx = i;
            }
        }
        
        if(startIdx == 100001){
            answer = new int[1];
            answer[0] = -1;
        }else if(startIdx != 100001 && endIdx == 0){
            answer = new int[1];
            answer[0] = 2;
        }else{
            answer = new int[(endIdx + 1) - startIdx];
            int idx = 0;
            for(int i = startIdx; i < endIdx + 1; i++){
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        return answer;
    }
}
