function solution(array) {
    var answer = [Math.max.apply(null, array), array.indexOf(Math.max.apply(null, array))];
    return answer;
}