class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] tempArr = new int[arr.length];
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            int temp = 0;
            while(true){
                if(arr[i] >= 50 && arr[i] % 2 == 0){ // 50보다 크거나 같은 짝수
                    arr[i] = arr[i] / 2;
                    // System.out.println("arr["+i+"] : "+ arr[i]);
                    temp++;
                }else if(arr[i] < 50 && arr[i] % 2 == 1){ // 50보다 작은 홀수
                    arr[i] = (arr[i] * 2) + 1;
                    // System.out.println("arr["+i+"] : "+ arr[i]);
                    temp++;
                }else{
                    break;
                }
            } 
            count = temp >= count ? temp : count;
        }
        
        return answer = count;
    }
}
