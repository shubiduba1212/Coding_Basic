function solution(numbers) {
    var answer = 0;
    for (let i of numbers) {
      answer += i;
    }
    
    // console.log(answer);
    // console.log(numbers.length);
    
    return answer / numbers.length;
}