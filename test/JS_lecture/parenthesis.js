function solution(s) {
    const stack = [];

    for (let i = 0; i < s.length; i++) {
        let temp = s[i];

        if (temp === '(') {
            // 여는 괄호면 스택에 추가
            stack.push(temp);
        } else if (temp === ')') {
            // 닫는 괄호인데 스택이 비어 있으면 false (짝이 없음)
            if (stack.length === 0) {
                return false;
            }
            // 짝이 맞는 여는 괄호 하나 제거
            stack.pop();
        }
    }

    // 모든 괄호가 짝을 이뤘다면 스택은 비어 있어야 함
    return stack.length === 0;
}
