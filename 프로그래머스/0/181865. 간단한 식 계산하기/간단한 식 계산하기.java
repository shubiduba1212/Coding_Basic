class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split("[\\s]");
        int firstNum = 0;
        int secondNum = 0;
        String op = "";
        for(int i = 0; i < arr.length; i++){
            firstNum = Integer.parseInt(arr[0]);
            secondNum = Integer.parseInt(arr[2]);
            op = arr[1];
        }
        
        answer = op.equals("+") ? firstNum + secondNum : op.equals("-") ? firstNum - secondNum : firstNum * secondNum;
        return answer;
    }
}