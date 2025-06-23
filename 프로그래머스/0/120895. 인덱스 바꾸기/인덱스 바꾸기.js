function solution(my_string, num1, num2) {
    var answer = '';
    const charArr = my_string.split('');
    [charArr[num1], charArr[num2]] = [charArr[num2], charArr[num1]];
    answer = charArr.join('');
    return answer;
}