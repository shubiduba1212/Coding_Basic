class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int startNum = 1;
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int left = 0;

        while (startNum <= n * n) {
            for (int i = left; i <= right; i++) {
                answer[top][i] = startNum;
                startNum++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                answer[i][right] = startNum;
                startNum++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                answer[bottom][i] = startNum;
                startNum++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                answer[i][left] = startNum;
                startNum++;
            }
            left++;
        }

        return answer;
    }
}
