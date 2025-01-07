class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1]; 
            char[] tempArr = new char[arr.length];
            
            for(int j = 0; j < arr.length; j++){  
                tempArr[j] = arr[j];
            }
            
            for(int j = 0; j < e - s + 1; j++){  
                arr[s + j] = tempArr[e - j];
            }
        }
    
        return answer = String.valueOf(arr);
    }
}
