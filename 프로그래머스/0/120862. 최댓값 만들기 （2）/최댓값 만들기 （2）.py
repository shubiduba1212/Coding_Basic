def solution(numbers):
    numbers.sort()
    print(numbers)
    answer = numbers[len(numbers) - 2] * numbers[len(numbers) - 1] if numbers[0] * numbers[1] < numbers[len(numbers) - 2] * numbers[len(numbers) - 1] else numbers[0] * numbers[1]
    # for
    return answer