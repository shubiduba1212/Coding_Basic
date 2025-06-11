function solution(array, n) {
    var answer = 0;
    array.sort((a,b) => {return a - b});
    answer = array.lastIndexOf(n) - array.indexOf(n) > 1 ? array.lastIndexOf(n) - array.indexOf(n) + 1 : array.indexOf(n) != -1 ? 1 : 0;
    return answer;
}