class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        int count = 0;
        int[] tempArr = new int[r];
        
        for(int i = l; i <= r; i++){
            // 1 , 10, 11, 100, 101, 110, 111
            char[] numArr = String.valueOf(i).toCharArray();
            boolean check = true;
                                      
            for(char j : numArr){                    
                if(j != '0' && j != '5'){
                    check = false;
                    break;
                }
            } 
            
            if(check){
                tempArr[count] = i;
                count++;
            }            
              
        }
        
        if(count == 0){
            answer = new int[]{-1};
        }else{
            answer = new int[count];
            for(int i = 0; i < count; i++){
                answer[i] = tempArr[i];
            }
        }
        
        
        return answer;
    }
}