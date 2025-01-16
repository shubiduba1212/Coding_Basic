class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
                
        if(arr[0].length > arr.length){
            int length = arr[0].length;
            int[][] tempArr = new int[length][length];
            for(int i = 0; i < tempArr.length; i++){                    
                for(int j = 0; j < tempArr.length; j++){
                    if(i >= arr.length){
                        tempArr[i][j] = 0;
                    }else{
                        tempArr[i][j] = arr[i][j];
                    }
                }                
            }
            answer = tempArr;
            
        }else if(arr[0].length < arr.length){
            int length = arr.length;
            int[][] tempArr = new int[length][length];
            for(int i = 0; i < tempArr.length; i++){
                for(int j = 0; j < tempArr.length; j++){
                    if(j >= arr[i].length){
                        tempArr[i][j] = 0;
                    }else{
                        tempArr[i][j] = arr[i][j];
                    }
                }
            }
            answer = tempArr;
        }else{
            answer = arr;
        }
        
        return answer;
    }
}
