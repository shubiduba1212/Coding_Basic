function solution(s) {
    var answer = 0;
    const arr = s.split(" ");
    
    for(let i in arr){
        if(arr[i] == 'Z'){
            answer -= parseInt(arr[i-1]);
        }else{
            answer += parseInt(arr[i]);
        }
    }
    return answer;
}