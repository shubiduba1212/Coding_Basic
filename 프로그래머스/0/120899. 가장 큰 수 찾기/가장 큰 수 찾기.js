function solution(array) {
    // var answer = [Math.max.apply(null, array), array.indexOf(Math.max.apply(null, array))];
    // 효율성 (계산 속도, 시간 복잡도) 분석
    // Math.max.apply(null, array): 이 메소드는 내부적으로 배열의 모든 요소를 순회하여 최댓값을 찾습니다. 시간 복잡도는 **O(N)**입니다. (N은 배열의 길이)
    // array.indexOf(maxValue): 이 메소드는 배열의 시작부터 maxValue를 찾을 때까지 순회합니다. 최악의 경우(최댓값이 배열의 마지막에 있거나 배열이 매우 길 때) 배열의 거의 모든 요소를 순회할 수 있으므로, 시간 복잡도는 **O(N)**입니다.
    // 따라서, 현재 코드는 배열을 최소 두 번 순회하게 되므로 전체 시간 복잡도는 O(N) + O(N) = O(2N), 즉 **O(N)**입니다. 공간 복잡도는 상수를 사용하므로 O(1)입니다.

    let maxNum = array[0];
    let index = 0;
    
    for(let i = 1; i < array.length; i++){
        if(maxNum < array[i]){
            maxNum = array[i];
            index = i;
        }
    }
    
    return answer = [maxNum, index];
    return answer;
}
