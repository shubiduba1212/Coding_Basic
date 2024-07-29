class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        String[] arr = my_string.split("\\s+");
        
        int noEmpty = 0;
        for (String s : arr) {
            if (!s.isEmpty()) {
                noEmpty++;
            }
        }
        
        answer = new String[noEmpty];
        int index = 0;
        for (String s : arr) {
            if (!s.isEmpty()) {
                answer[index++] = s;
            }
        }
        return answer;
    }
}