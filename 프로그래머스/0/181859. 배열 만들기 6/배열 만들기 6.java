class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        int[] stk = {};
        
        while(i < arr.length){
            if(stk.length == 0){
                int[] tempArr = new int[1];
                tempArr[0] = arr[i];
                stk = tempArr;
            }else{
                //System.out.println("stk.length : " + stk.length);
                if(stk[stk.length - 1] == arr[i]){
                    int[] tempArr = new int[stk.length - 1];
                    for(int j = 0; j < tempArr.length; j++){
                        tempArr[j] = stk[j];
                        //System.out.println(tempArr[j]);
                    }
                    stk = tempArr;  
                }else{
                    int[] tempArr = new int[stk.length + 1];
                    for(int j = 0; j < tempArr.length; j++){
                        if(j == tempArr.length - 1){
                            tempArr[j] = arr[i];
                        }else{
                            tempArr[j] = stk[j];
                        }
                    }
                    stk = tempArr;
                }
            }
            i++;
        }
        
        if(stk.length == 0){
            int[] tempArr = new int[1];
            tempArr[0] = -1;
            stk = tempArr;
        }
        return answer = stk;
    }
}
