function solution(s) {
    // var answer = s.split('').filter(char => s.indexOf(char) == s.lastIndexOf(char)).sort().join('');
    // 문자열의 길이(N)에 비례하는 O(N) 시간 복잡도입니다.
    // filter(char => s.indexOf(char) == s.lastIndexOf(char)):
    // filter는 문자 배열의 각 요소(N개)에 대해 콜백 함수를 실행합니다.
    // 콜백 함수 내에서 s.indexOf(char)와 s.lastIndexOf(char)가 호출됩니다. 이 두 메서드는 문자열 s 전체를 순회하며 char를 찾습니다. 최악의 경우 각각 O(N)의 시간이 걸립니다.
    // 따라서 filter 내부의 콜백 함수는 각 문자마다 O(N) 작업을 두 번 수행하므로, filter 전체의 시간 복잡도는 N * O(N) = O(N^2)이 됩니다.
    // sort(): 정렬 알고리즘의 일반적인 시간 복도 O(K log K)입니다. 여기서 K는 필터링된 배열의 길이(N보다 작거나 같음)입니다. 최악의 경우 O(N log N)이 될 수 있습니다.
    // join(''): O(K)입니다.
    // 따라서, 이 코드의 전체 시간 복잡도는 filter 단계의 O(N^2)에 의해 지배됩니다. (공간 복잡도는 O(N))
    // N의 길이가 1000 미만이라고 제한되어 있지만, N^2는 최대 1,000,000번의 연산이 될 수 있어 비효율적일 수 있습니다.
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
