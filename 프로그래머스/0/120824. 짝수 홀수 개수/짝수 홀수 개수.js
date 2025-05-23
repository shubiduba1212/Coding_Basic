function solution(num_list) {
    var answer = [];
    answer[0] = 0;
    answer[1] = 0;
    for(let i of num_list){
        if(i % 2 == 0){
            answer[0] += 1;
        }else{
            answer[1] += 1;
        }
    }
    return answer;
}