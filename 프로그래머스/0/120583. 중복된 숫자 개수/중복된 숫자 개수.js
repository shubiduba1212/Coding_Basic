function solution(array, n) {
    var answer = 0;
    answer = array.filter(num => num == n).length;
    //시간 복잡도: O(N) (N은 배열의 길이)

    // array.sort((a,b) => {return a - b}); // 문제점 1: 원본 배열 변경 및 O(N log N)
    // answer = array.lastIndexOf(n) - array.indexOf(n) > 1 ? array.lastIndexOf(n) - array.indexOf(n) + 1 : array.indexOf(n) != -1 ? 1 : 0;
    // 문제점 2: 로직이 복잡하고, n이 없거나 하나만 있을 때 예외 처리 필요
    // 문제점 3: n이 배열의 맨 앞/뒤에 몰려있을 때 정확한 개수를 세지 못함
    return answer;
}
