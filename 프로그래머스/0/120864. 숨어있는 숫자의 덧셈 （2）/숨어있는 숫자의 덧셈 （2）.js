function solution(my_string) {
    var answer = 0;
    const arr = my_string.split('').map(char => {if(isNaN(parseInt(char))){return char = '_';}else{return char;}}).join('').split('_').filter(item => item != '');
    for(i of arr) {
        answer += parseInt(i);
    }

    // 정규식 표현을 통해 가능한 방법
    // 1. 문자열에서 숫자만 추출하는 정규표현식 사용
    //    \d+: 하나 이상의 연속된 숫자
    //    g: 전역 검색 (문자열 내의 모든 일치 항목 검색)
    // const numbers = my_string.match(/\d+/g);

    // 2. 추출된 숫자들이 없는 경우 0을 반환 (match 결과가 null일 수 있음)
    // if (!numbers) {
    //     return 0;
    // }

    // 3. 각 숫자를 정수로 변환하여 합산 (reduce 사용)
    //    parseInt(num, 10): 문자열을 10진수 정수로 변환
    // const answer = numbers.reduce((sum, num) => sum + parseInt(num, 10), 0);

    return answer;
}
