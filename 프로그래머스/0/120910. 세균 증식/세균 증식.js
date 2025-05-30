function solution(n, t) {
    var answer = 0;
    while(t > 0){
        answer = n *= 2;
        t--;
    }
    return answer;
}