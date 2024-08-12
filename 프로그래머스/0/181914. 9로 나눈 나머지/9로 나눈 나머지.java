class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] arr = number.toCharArray();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Integer.parseInt(String.valueOf(arr[i]));
        }
        answer = sum % 9;
        return answer;
    }
}