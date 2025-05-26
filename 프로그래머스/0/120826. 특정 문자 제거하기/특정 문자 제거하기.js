function solution(my_string, letter) {
    var answer = "";
    let str = my_string.split(letter);
    for (let i of str){
        answer += i.toString();
    }
    return answer;
}