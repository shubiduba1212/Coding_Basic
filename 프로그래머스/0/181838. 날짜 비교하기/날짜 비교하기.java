class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for(int i = 0; i < 3; i++){            
            if(date1[i] < date2[i]){
                return answer = 1; 
            } else if(date1[i] > date2[i]){
               return answer = 0;
            }
        }
        return answer = 0;
    }
}
