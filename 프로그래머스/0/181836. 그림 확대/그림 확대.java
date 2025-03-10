class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};        
        int length = picture.length * k;
        String[] tempArr = new String[length];
        
        for(int i = 0; i < picture.length; i++){
            char[] picCharArr = picture[i].toCharArray();
            char[] newCharArr = new char[picCharArr.length * k];
            for(int j = 0; j < picCharArr.length; j++){
                for(int l = j * k; l < ((j * k) + k); l++){
                    newCharArr[l] = picCharArr[j];                    
                    //System.out.println(newCharArr[l]);
                }
            }
            picture[i] = String.valueOf(newCharArr);
            //System.out.println("picture["+i+"]" + picture[i]);
        }
        
        for(int i = 0; i < picture.length; i++){
            for(int j = i * k; j < ((i * k) + k); j++){
                tempArr[j] = picture[i];                    
                //System.out.println(tempArr[j]);
            }
        }
        
        return answer = tempArr;
    }
}
