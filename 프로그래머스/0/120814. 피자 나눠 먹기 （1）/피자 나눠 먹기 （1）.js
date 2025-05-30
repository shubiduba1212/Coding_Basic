function solution(n) {
    var answer = n / 7 == 0 ? n / 7 : n / 7 > 1 ? Math.ceil(n / 7) : 1;
    return answer;
}