class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int length = 0;
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                length++;
            }
        }
        
        answer = new String[length];
        int idx = 0;
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){                
                answer[idx] = todo_list[i];     
                idx++;
            }
        }
        return answer;
    }
}