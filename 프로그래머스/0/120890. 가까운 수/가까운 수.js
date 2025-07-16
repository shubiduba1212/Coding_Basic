function solution(array, n) {
    var answer = 0;
    const minNum = Math.min.apply(null, array.filter(item => item - n >= 0));
    const maxNum = Math.max.apply(null, array.filter(item => item - n <= 0));
    // if((minNum - n) >= Math.abs(n - maxNum)){
    //     answer = maxNum;
    // }else{
    //     answer
    // }
    return answer = (minNum - n) >= Math.abs(n - maxNum) ? maxNum : minNum;
}