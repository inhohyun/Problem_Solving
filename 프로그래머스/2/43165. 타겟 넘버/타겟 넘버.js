let answer = 0;

function solution(numbers, target) {
    dfs(numbers, target, 0, 0);
    return answer;
}

function dfs(numbers, target, sum, index) {
    // 탈출 조건: 모든 숫자를 사용한 경우
    if (index === numbers.length) {
        if (sum === target) {
            answer++;
        }
        return;
    }

    // 현재 숫자를 더하거나 빼는 두 갈래로 탐색
    dfs(numbers, target, sum + numbers[index], index + 1);
    dfs(numbers, target, sum - numbers[index], index + 1);
}
