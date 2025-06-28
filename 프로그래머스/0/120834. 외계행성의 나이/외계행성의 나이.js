function solution(age) {
    var answer = '';
    arr = ['a','b','c','d','e','f','g','h','i','j']
    answer = (age.toString().split('').map(num => arr[parseInt(num)]).join(''));
    return answer;
}