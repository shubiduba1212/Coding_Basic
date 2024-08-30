class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[] arr_row = new char[m];
        char[] arr = my_string.toCharArray();
        char[] arr_combined = new char[(arr.length / m)];
        int idx = 0;
        int idx_column = 0;        
        for(int i = 0; i < arr.length; i++){            
            arr_row[idx] = arr[i];            
            if(i % m == (m - 1)){
                idx = 0;         
                arr_combined[idx_column] = arr_row[(c - 1)];
                // System.out.println("arr_combined[" + idx_column + "] : ");
                // System.out.println(arr_combined[idx_column]);
                idx_column++;
            }else{                
                idx++;
            }
        }
        return answer = String.valueOf(arr_combined);
    }
}