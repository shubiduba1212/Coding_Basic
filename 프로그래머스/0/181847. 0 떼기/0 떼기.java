class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] arr = n_str.toCharArray();
        int idx = 0;
        while(idx < arr.length && arr[idx] == '0'){
            idx++;
        }
        if(idx == arr.length){
            return"";
        }
        answer = n_str.substring(idx);
        return answer;
    }
}