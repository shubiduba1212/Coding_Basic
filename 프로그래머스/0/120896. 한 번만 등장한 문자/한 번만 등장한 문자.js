function solution(s) {
    var answer = s.split('').filter(char => s.indexOf(char) == s.lastIndexOf(char)).sort().join('');
    return answer;
}