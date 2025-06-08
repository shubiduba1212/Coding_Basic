function solution(slice, n) {
    var answer = n % slice == 0 ? Math.floor(n / slice) : n > slice ? Math.floor(n / slice) + 1 : 1;
    return answer;
}