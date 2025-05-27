function solution(my_string) {
    var answer = '';
    for (let i = my_string.length; i >= 0; i--){
        answer += my_string.substring(i, i+1);
    }
    return answer;
}