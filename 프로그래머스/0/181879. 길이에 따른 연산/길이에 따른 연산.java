class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        for(int i = 0; i < num_list.length; i++){
            if(num_list.length >= 11){
                answer += num_list[i];
            }else{
                multiple *= num_list[i];                
            }
            
        }
        return answer = num_list.length >= 11 ? answer : multiple;
    }
}