class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int length = names.length % 5 == 0 ? (names.length / 5) : (names.length / 5 + 1);
        answer = new String[length];
        int idx = 0;
        for(int i = 0; i < names.length; i++){
            System.out.println(length);
            
            if(i % 5 == 0){
                answer[idx] = names[i];
                idx++;
            }
        }
        return answer;
    }
}