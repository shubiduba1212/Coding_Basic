class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char[] tempArr = my_string.toCharArray();
        
        for(int i = 0; i < e - s + 1; i++){            
            arr[s + i] = tempArr[e - i];
        }
    
        return answer = String.valueOf(arr);
    }
}
