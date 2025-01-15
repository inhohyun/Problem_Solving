function solution(s) {
    let stack = [];
    for (let item of s) { // 문자열을 한 글자씩 순회
        if (item === '(') {
            stack.push('('); // 열린 괄호를 스택에 추가
        } else {
            if (stack.length === 0) { // 닫는 괄호인데 스택이 비어 있으면
                return false; // 올바르지 않은 괄호 구조
            }
            stack.pop(); // 닫는 괄호가 있으므로 스택에서 제거
        }
    }

    // 스택이 비어 있으면 올바른 구조, 비어 있지 않으면 불완전한 구조
    return stack.length === 0;
}


