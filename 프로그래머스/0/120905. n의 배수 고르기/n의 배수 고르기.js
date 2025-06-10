function solution(n, numlist) {
    var answer = numlist.filter((num) => {return num % n == 0});
    return answer;
}