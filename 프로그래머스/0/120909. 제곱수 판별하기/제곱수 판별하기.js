function solution(n) {
    var answer = Math.floor(n ** 0.5) ** 2 == n ? 1 : 2;
    return answer;
}