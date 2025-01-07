class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];// 2, 0, 5, 6
            int e = queries[i][1]; 
            char[] tempArr = new char[arr.length];
            
            for(int j = 0; j < arr.length; j++){  
                tempArr[j] = arr[j];
            }
            
            for(int j = 0; j < e - s + 1; j++){  
                // System.out.println("tempArr["+ (e - j) +"] : "+tempArr[e - j]);
                // System.out.println("tempArr : "+ String.valueOf(tempArr));
                arr[s + j] = tempArr[e - j];
                // System.out.println("arr : "+ String.valueOf(arr));
            }
            
            // System.out.println("after - arr : "+ String.valueOf(arr));
        }
    
        return answer = String.valueOf(arr);
    }
}
