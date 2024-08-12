class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] > 'l' ? arr[i] : 'l';
        }
        answer = String.valueOf(arr);
        return answer;
    }
}