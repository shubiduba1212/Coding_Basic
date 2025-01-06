class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p = 0, q = 0;
        int[] dice = {a, b, c, d};
               
        if (a == b && b == c && c == d) { // 네 숫자가 모두 같을 경우
            answer = 1111 * a;
        } else if ((a == b && b == c) || 
                 (a == b && b == d) || 
                 (a == c && c == d) || 
                 (b == c && c == d)) { // 세 숫자가 같고 하나가 다른 경우
            p = (a == b && b == c) ? a : (a == b && b == d) ? a : 
                (a == c && c == d) ? a : b;
            q = (a == b && b == c) ? d : (a == b && b == d) ? c : 
                (a == c && c == d) ? b : a;
            answer = (10 * p + q) * (10 * p + q);
        } 
        // 두 쌍의 숫자가 같은 경우
        else if ((a == b && c == d) || 
                 (a == c && b == d) || 
                 (a == d && b == c)) {
            p = (a == b && c == d) ? a : (a == c && b == d) ? a : a;
            q = (a == b && c == d) ? c : (a == c && b == d) ? b : b;
            answer = (p + q) * Math.abs(p - q);
        } 
        // 두 숫자가 같고 나머지 두 숫자가 다른 경우
        else if ((a == b && c != d) || 
                 (a == c && b != d) || 
                 (a == d && b != c) || 
                 (b == c && a != d) || 
                 (b == d && a != c) || 
                 (c == d && a != b)) {
            if (a == b) {
                q = c;
                int r = d;
                answer = q * r;
            } else if (a == c) {
                q = b;
                int r = d;
                answer = q * r;
            } else if (a == d) {
                q = b;
                int r = c;
                answer = q * r;
            } else if (b == c) {
                q = a;
                int r = d;
                answer = q * r;
            } else if (b == d) {
                q = a;
                int r = c;
                answer = q * r;
            } else if (c == d) {
                q = a;
                int r = b;
                answer = q * r;
            }
        }
        // 네 숫자가 모두 다른 경우
        else {
            int minValue = dice[0];
            for (int i = 1; i < dice.length; i++) {
                if (dice[i] < minValue) {
                    minValue = dice[i];
                }
            }
            answer = minValue;
        }

        return answer;
    }
}
