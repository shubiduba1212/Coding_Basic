class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] arr = myString.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'A'){
                arr[i] = 'B';
            }else{
                arr[i] = 'A';
            }
        }
        String str = new String(arr);
        answer = str.contains(pat) ? 1 : 0;
        return answer;
    }
}