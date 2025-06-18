function solution(my_string) {
    var answer = [];
    // answer = my_string.split('')
    //                   .filter(char => !Number.isNaN(Number(char)))
    //                   .map(Number)
    //                   .sort((a,b) => a - b);
    for (let char of my_string) {
        const num = Number(char);
        if (!Number.isNaN(num)) {
            answer.push(num);
        }
    }
    answer.sort((a, b) => a - b);
    return answer;
}
