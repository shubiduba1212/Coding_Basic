class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int length = 0;
        int[] tempArr = new int[intStrs.length];
        for(int i = 0; i < intStrs.length; i++){
            tempArr[i] = Integer.parseInt(intStrs[i].substring(s, s + l));
            if(Integer.parseInt(intStrs[i].substring(s, s + l)) > k){                
                length++;                
            }
        }
        answer = new int[length];
        int idx = 0;
        for(int i = 0; i < tempArr.length; i++){
            if(tempArr[i] > k){
                answer[idx] = tempArr[i];
                idx++;                
            }
        }
        return answer;
    }
}