class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int num = n;
        int length = 0;
        
        while(n > 1){
            length++;
            if(n == 1){
                break;
            }
            n = n % 2 == 0 ? (n / 2) : n * 3 + 1;
        }
        
        answer = new int[length + 1];        
        for(int i = 0; i < answer.length; i++){
            if(i == 0){
                answer[i] = num;
            }else{
                answer[i] = num % 2 == 0 ? (num / 2) : num * 3 + 1;
                num = answer[i];
            }            
        }
        return answer;
    }
}