class Solution {
    public String solution(String code) {
        String answer = "";
        char[] strArr = code.toCharArray();
        String tempStr = "";
        int mode = 0;
        
        for(int i = 0; i < strArr.length; i++){
            //System.out.println(mode);
            if(strArr[i] == '1'){
                mode = mode == 0 ? 1 : 0;
            }else{
                if(mode == 0){
                    if(i % 2 == 0){
                        tempStr += String.valueOf(strArr[i]);
                        //System.out.println(tempStr);
                    }

                }else{
                    if(i % 2 == 1){
                        tempStr += String.valueOf(strArr[i]);
                        //System.out.println(tempStr);
                    }
                }
            }                                    
        }
        return answer = tempStr == "" ? "EMPTY" : tempStr;
    }
}