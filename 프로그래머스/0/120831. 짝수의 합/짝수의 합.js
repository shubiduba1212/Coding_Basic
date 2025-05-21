function solution(n) {
    var answer = 0;
    while(n > 1){
        if(n % 2 == 0){
            answer += n;
        }
        
        n-- ;
    }
    return answer;
}