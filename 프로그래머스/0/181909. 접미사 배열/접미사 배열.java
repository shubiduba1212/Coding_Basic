class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            answer[i] = my_string.substring(i);
        }
        
        for(int i = 0; i < answer.length - 1; i++){
            for(int j = 0; j < answer.length - i - 1; j++){
                if(answer[j].compareTo(answer[j + 1]) > 0){
                    String str = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = str;
                }
            }
        }
        return answer;
    }
}