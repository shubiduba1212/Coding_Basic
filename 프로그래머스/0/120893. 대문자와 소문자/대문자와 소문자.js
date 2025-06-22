function solution(my_string) {
    var answer = '';
    for(let char of my_string){
        const char_check = char.toLowerCase();
        if (char == char_check){
            const charUpper = char.toUpperCase();
            answer += charUpper;
        }else{
            answer += char_check;
        }
    }
    return answer;
}