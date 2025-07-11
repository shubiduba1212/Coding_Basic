function solution(my_string) {
    var answer = 0;
    const arr = my_string.split('').map(char => {if(isNaN(parseInt(char))){return char = '_';}else{return char;}}).join('').split('_').filter(item => item != '');
    for(i of arr) {
        answer += parseInt(i);
    }
    return answer;
}
