class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] arr = num_str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            answer += Integer.parseInt(String.valueOf(arr[i]));
        }
        return answer;
    }
}