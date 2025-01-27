class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] tempArr = new int[strArr.length];        
        for(int i = 0; i < strArr.length; i++){
            tempArr[i] = strArr[i].length();  
        }
        int temp = 0;
        
        for(int i = 0; i < tempArr.length; i++){
            int start = tempArr[i];
            int count = 0;
            for(int j = 0; j < tempArr.length; j++){
                if(start == tempArr[j]){
                    count++;
                    temp = count >= temp ? count : temp;                    
                }
            }            
        }
        answer = temp;
        return answer;
    }
}
