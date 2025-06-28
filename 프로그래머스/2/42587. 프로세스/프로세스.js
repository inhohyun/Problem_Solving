function solution(priorities, location) {
    let arr = priorities.map((value, index) => [value, index === location]);
    let cnt = 0;

    while (arr.length > 0) {
        const current = arr.shift();
        const hasHigher = arr.some(item => item[0] > current[0]);

        if (hasHigher) {
            // 더 높은 우선순위가 있으면 다시 뒤로 보냄
            arr.push(current);
        } else {
            // 현재 값 출력 처리
            cnt++;
            if (current[1]) {
                // 내가 찾던 작업이면
                return cnt;
            }
        }
    }
}
