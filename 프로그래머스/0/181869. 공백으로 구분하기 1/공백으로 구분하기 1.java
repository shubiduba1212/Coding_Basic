class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String[] arr = my_string.split("\\s");
        answer = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
           answer[i] = arr[i];
        }
        return answer;
    }
}