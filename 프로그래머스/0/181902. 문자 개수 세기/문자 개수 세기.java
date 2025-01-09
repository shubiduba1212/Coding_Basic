class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] strArr = my_string.toCharArray();
        
        for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < alphabet.length; j++){
                if(strArr[i] == alphabet[j]){
                    answer[j] += 1;
                    // System.out.println(alphabet[i] + " : " + answer[j]);
                }
            }
        }
        
        return answer;
    }
}