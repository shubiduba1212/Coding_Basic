class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(eq.equals("=")){
            boolean result = ineq.equals(">") ? n >= m : n <= m;
            answer = (result == true ? 1 : 0);
        }else{
            boolean result = ineq.equals(">") ? n > m : n < m;
            answer = (result == true ? 1 : 0);
        }
        return answer;
    }
}