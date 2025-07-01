function solution(numbers, direction) {
    var answer = [];
    if(direction == 'right'){
        answer = [numbers[numbers.length - 1], ...numbers.slice(0, numbers.length - 1)]
    }else{
        answer = [...numbers.slice(1), numbers[0]]
    }
    return answer;
    
    // if(direction == 'right'){
    //     const lastNum = numbers.pop();
    //     numbers.unshift(lastNum);
    // }else{
    //     const firstNum = numbers.shift();
    //     numbers.push(firstNum);
    // }
    // return numbers;
    // shift()/unshift()처럼 원본 배열의 요소를 물리적으로 "밀거나 당기는" 방식 
    // 정확히는 shift/unshift의 구현 방식에서 발생하는 비용이 더 크다function solution(numbers, direction) {
    var answer = [];
    if(direction == 'right'){
        answer = [numbers[numbers.length - 1], ...numbers.slice(0, numbers.length - 1)]
    }else{
        answer = [...numbers.slice(1), numbers[0]]
    }
    return answer;
    
    // if(direction == 'right'){
    //     const lastNum = numbers.pop();
    //     numbers.unshift(lastNum);
    // }else{
    //     const firstNum = numbers.shift();
    //     numbers.push(firstNum);
    // }
    // return numbers;
    // shift()/unshift()처럼 원본 배열의 요소를 물리적으로 "밀거나 당기는" 방식 
    // 정확히는 shift/unshift의 구현 방식에서 발생하는 비용이 더 크다.
    // JavaScript 배열은 내부적으로 연속된 메모리 블록에 저장되는 경우가 많다. 
    // 맨 앞에 요소를 추가하려면 기존의 모든 요소를 한 칸씩 뒤로 밀어야 한다. 따라서 unshift()의 시간 복잡도는 O(N) (N은 배열의 길이)입니다.
    // numbers.shift(): 배열의 맨 첫 번째 요소를 제거하고 반환한다. 
    // unshift()와 유사하게, 첫 요소를 제거한 후 나머지 모든 요소를 한 칸씩 앞으로 당겨야 하므로 시간 복잡도는 **O(N)**이다.
}
