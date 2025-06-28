function solution(k, tangerine) {
    let answer = 0;
    const map = {};

    // 1. 각 크기의 귤 개수 세기
    tangerine.forEach((value) => {
        if (map[value] === undefined) {
            map[value] = 1;
        } else {
            map[value] += 1;
        }
    });

    // 2. 개수 기준 내림차순 정렬
    const sorted = Object.entries(map).sort((a, b) => b[1] - a[1]);

    // 3. 개수 누적하며 최소한의 종류 수 구하기
    let temp = 0;
    for (const [_, count] of sorted) {
        temp += count;
        answer++;
        if (temp >= k) break;
    }

    return answer;
}
