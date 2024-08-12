class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] myArray = myString.split("x", -1);   
        answer = new int[myArray.length];
        int index = 0;
        for (String s : myArray) {
          answer[index] = s.length();
          index++;
            System.out.println(s);
        }
        return answer;
    }
}