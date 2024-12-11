class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] myArray = my_string.toCharArray();
        
        for(int i = 0; i < indices.length; i++){        
            myArray[indices[i]] = 'A';
            System.out.println(String.valueOf(myArray).replaceAll("A",""));
        }
        return answer = String.valueOf(myArray).replaceAll("A","");
    }
}