function solution(my_string) {
    const arr = my_string.split(" ");
    var answer = parseInt(arr[0]);
    
    for(let i = 1; i < arr.length; i += 2){
        const num = parseInt(arr[i+1]);
        answer = arr[i] == '+' ? answer + num : answer - num;
    }
    return answer;
}