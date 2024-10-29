class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        int length = 0;
        
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].contains("ad")){
                strArr[i] = "";                
            }else{
                length++;
            }
        }
        
        answer = new String[length];
        int idx = 0;
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].isEmpty()){ 
                answer[idx] = strArr[i];
                idx++;
            }
        }
        
        return answer;
    }
}
