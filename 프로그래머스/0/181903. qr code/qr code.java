class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] arr = code.toCharArray();
        char[] answerArr = {};
        int count = 0;
        int idx = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(i % q == r){                
                count++;
            }
        }
        
        answerArr = new char[count];
        
        for(int i = 0; i < arr.length; i++){
            if(i % q == r){
                answerArr[idx] = arr[i];
                idx++;
            }
        }
        
        return answer = String.valueOf(answerArr);
    }
}
