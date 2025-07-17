function solution(array, n) {
    var answer = 0;
    const minNum = Math.min.apply(null, array.filter(item => item - n >= 0));
    const maxNum = Math.max.apply(null, array.filter(item => item - n <= 0));
    return answer = (minNum - n) >= Math.abs(n - maxNum) ? maxNum : minNum;
}
