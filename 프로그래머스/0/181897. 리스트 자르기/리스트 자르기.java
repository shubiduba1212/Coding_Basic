class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int length = 0;
        int startIdx = 0;
        boolean isGap = false;
        
        switch(n){
            case 1 : length = slicer[1] + 1; break;
            case 2 : length = num_list.length - slicer[0]; startIdx = slicer[0]; break;
            case 3 : length = slicer[1] - slicer[0] + 1; startIdx = slicer[0]; break;
            case 4 : length = ((slicer[1] - slicer[0]) / slicer[2]) + 1;
                     startIdx = slicer[0]; isGap = true; break;
           }
        
        answer = new int[length];
        for(int i = 0; i < length; i++){
            if(isGap){
                answer[i] = num_list[(i * slicer[2]) + startIdx];
            }else{
                answer[i] = num_list[i + startIdx];
            }            
        } 
        
        return answer;
    }
}