function solution(n) {
        var answer = 1;
    let facNum = 1;
    while (facNum < n) {        
        answer += 1;
        facNum *= answer;
    }
    
    if(facNum != n){
        answer -= 1;
    }
    return answer;
}