class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int start = numLog[0];
        char[] arr = new char[numLog.length - 1];
        for(int i = 0; i < numLog.length; i++){
            if(i > 0){
                arr[i-1] = (numLog[i] - numLog[i-1] == 1) ? 'w' : (numLog[i] - numLog[i-1] == -1) ? 's' : (numLog[i] - numLog[i-1] == 10) ? 'd' : 'a';
            }
        }
        return answer = String.valueOf(arr);
    }
}