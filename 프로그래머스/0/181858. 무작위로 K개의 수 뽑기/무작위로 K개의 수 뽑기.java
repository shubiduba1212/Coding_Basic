class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        int[] curArr = new int[k];
        int idx = 0;
        int count = 0;
                
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                //System.out.println("arr["+i+"] : " + arr[i] + " vs arr["+j+"] : " + arr[j]);
                if(arr[i] == arr[j]){
                    arr[j] = 100001;
                    count++;
                }
            }   
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 100001 && idx < k){
                curArr[idx] = arr[i];
                //System.out.println("curArr["+idx+"] : " + curArr[idx]);
                idx++;
            }
        }
        //System.out.println("idx : " + idx);
        
        if(idx < k){
            for(int i = idx; i < k; i++){
                curArr[i] = -1; 
            }
        }
        
        return answer = curArr;
    }
}