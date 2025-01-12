class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        char[] arr = myStr.toCharArray();
        int count = 0;        
                
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'b' || arr[i] == 'c'){
                arr[i] = 'A';
            }else{
                count = 1;
            }
        }
        
        if(count == 0){
            answer = new String[1];
            answer[0] = "EMPTY";
        }else{
            int empty = 0;
            int idx = 0;
            String[] tempArr = String.valueOf(arr).split("A");
            for(int i = 0; i < tempArr.length; i++){
                if(tempArr[i].isEmpty()){
                    empty++;
                }                 
            }
            answer = new String[tempArr.length - empty];
            
            for(int i = 0; i < tempArr.length; i++){
                if(!tempArr[i].isEmpty()){
                    answer[idx] = tempArr[i];
                    idx++;
                }
            }
        }
        return answer;
    }
}
