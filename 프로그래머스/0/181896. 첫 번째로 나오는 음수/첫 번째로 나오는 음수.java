class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int idx = 0;
        int[] indexArr = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] < 0){
                indexArr[i] = -1;            
            }else{
                indexArr[i] = 1;
            }
        }
        for(int i = 0; i < indexArr.length; i++){
            if(indexArr[i] == -1){
               return idx = i;
            }
        }
        return answer = idx == 0 ? -1 : idx;
    }
}