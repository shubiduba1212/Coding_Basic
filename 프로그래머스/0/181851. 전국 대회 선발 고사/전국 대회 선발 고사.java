class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;  
        int idx = 0;
        int[][] trueList = {};
        
        for(int i = 0; i < rank.length; i++){            
            if(attendance[i] == true){
                int[][] tempArr = new int[idx + 1][2];
                for(int j = 0; j < tempArr.length; j++){
                    if(j >= idx){
                        tempArr[idx][0] = i;
                        tempArr[idx][1] = rank[i];
                    }else{
                        tempArr[j][0] = trueList[j][0];
                        tempArr[j][1] = trueList[j][1];
                    }
                }
                idx++;
                trueList = tempArr;
            }
        }
        
        for(int i = 0; i < trueList.length - 1; i++){                        
            for(int j = 0; j < trueList.length - 1 - i; j++){                                
                if(trueList[j][1] > trueList[j+1][1]){
                    int temp1 = trueList[j][0];
                    int temp2 = trueList[j][1];
                    
                    trueList[j][0] = trueList[j+1][0];
                    trueList[j][1] = trueList[j+1][1];
                    trueList[j+1][0] = temp1;
                    trueList[j+1][1] = temp2;
                    // System.out.println("trueList["+j+"]["+0+"] : " + trueList[j][0]);
                    // System.out.println("trueList["+j+"]["+1+"] : " + trueList[j][1]);
                }
            }
        }
        
        return answer = (trueList[0][0] * 10000) + (trueList[1][0] * 100) + trueList[2][0];
    }
}
