class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for(int i = 0; i < 3; i++){            
            if(date1[i] < date2[i]){
                return 1; // date1이 date2보다 앞선다.
            } else if(date1[i] > date2[i]){
                return 0; // date1이 date2보다 늦다.
            }
        }
        return 0; // 두 날짜가 같은 경우
    }
}