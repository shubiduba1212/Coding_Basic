function solution(numbers) {
    var answer = 0;
    numbers.sort((a,b) => {return b-a});
    answer = numbers[0] * numbers[1];
    return answer;
}