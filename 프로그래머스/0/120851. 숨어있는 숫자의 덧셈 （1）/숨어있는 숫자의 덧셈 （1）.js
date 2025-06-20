function solution(my_string) {
    var answer = 0;
    for(let i of my_string){
        if(!isNaN(Number(i))){
            answer += Number(i);
        }        
    }
    return answer;
}