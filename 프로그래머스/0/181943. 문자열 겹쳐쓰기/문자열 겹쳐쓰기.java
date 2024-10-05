class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] arr = overwrite_string.toCharArray();
        char[] arr2 = my_string.toCharArray();
        String toBeReplaced = my_string.substring(s, (arr.length + s));
        
        if(my_string.indexOf(toBeReplaced) != s){
            if(arr2.length == (s + 1)){
                answer = my_string.substring(0, s).concat(overwrite_string);
            }else{
                answer = my_string.substring(0, s).concat(overwrite_string).concat(my_string.substring(arr.length + s));
            }
        }else{
            answer = my_string.replaceFirst(toBeReplaced, overwrite_string);
        }
        return answer;
    }
}
