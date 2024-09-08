class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int lastIdx = myString.lastIndexOf(pat);
        int length = pat.length();
        answer = myString.substring(0, lastIdx+length);
        return answer;
    }
}