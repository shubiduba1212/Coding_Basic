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
    // 정확히는 shift/unshift의 구현 방식에서 발생하는 비용이 더 큽니다.
}
