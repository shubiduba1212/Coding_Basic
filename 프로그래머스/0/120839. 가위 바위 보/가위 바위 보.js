function solution(rsp) {
    var answer = '';
    for(let i = 0; i < rsp.length; i++){
        answer += rsp[i] == "2" ? "0" : rsp[i] == "0" ? "5" : "2";
    }
    return answer;
}