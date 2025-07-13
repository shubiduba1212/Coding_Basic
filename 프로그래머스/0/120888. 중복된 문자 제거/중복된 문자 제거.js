function solution(my_string) {
    var answer = '';
    const arr = new Map();
    for(let i of my_string){
        if(!arr.get(i)){
            arr.set(i, 1);
            answer += i;
        }
    }
    return answer;
}