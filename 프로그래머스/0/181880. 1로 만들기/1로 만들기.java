class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){
            int temp = num_list[i];
            if(num_list[i] != 1){
                 while(temp > 1){
                    if(temp % 2 == 0){
                        temp = temp / 2;                        
                    }else{
                        temp = (temp - 1) / 2;
                    }
                    answer++;
                }
            }
        }
        return answer;
    }
}