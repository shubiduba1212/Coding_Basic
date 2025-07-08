function solution(s) {
    // var answer = s.split('').filter(char => s.indexOf(char) == s.lastIndexOf(char)).sort().join('');
    var answer = '';
    const arr = new Map();
    for(const i of s){
        arr.set(i, (arr.get(i) || 0) + 1);
    }
    
    const onceArr = [];
    for(const [i, count] of arr){
        if (count == 1) {
            onceArr.push(i);
        }
    }
    answer = onceArr.sort().join('');
    return answer;
}