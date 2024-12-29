class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] strArr = myString.toCharArray();
        char[] patArr = pat.toCharArray();
        int sameCount = 0;
        for(int i = 0; i <= strArr.length - patArr.length; i++){            
            if(strArr[i] == patArr[0]){
                boolean check = true;
                for(int j = 0; j < patArr.length; j++){ 
                    
                    if(strArr[i + j] != patArr[j]){
                        check = false;
                        break;
                    }
                    System.out.println(strArr[i + j]);
                    check = true;
                }
                
                if(check){
                    sameCount++;
                }
                
            }
        }
        return answer = sameCount;
    }
}