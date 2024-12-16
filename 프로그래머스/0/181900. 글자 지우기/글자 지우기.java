class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < indices.length; i++){        
            arr[indices[i]] = 'A';
        }
        return answer = String.valueOf(arr).replaceAll("A","");
    }
}
