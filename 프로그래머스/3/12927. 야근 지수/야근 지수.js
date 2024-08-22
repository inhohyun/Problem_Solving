function solution(n, works) {
    // 최대 힙을 만들기 위해 works 배열을 내림차순 정렬
    works.sort((a, b) => b - a);

    // n이 0보다 클 때까지 반복
    while (n > 0) {
        // 가장 큰 값을 가져옴
        if (works[0] === 0) break;  // 가장 큰 값이 0이면 더 이상 감소시킬 필요가 없음

        // 가장 큰 값을 1 감소시킴
        works[0]--;

        // 감소시킨 후 다시 정렬 (첫 번째 원소만 내림차순 유지하면 됨)
        for (let i = 0; i < works.length - 1; i++) {
            if (works[i] < works[i + 1]) {
                // 스왑
                [works[i], works[i + 1]] = [works[i + 1], works[i]];
            } else {
                break;
            }
        }

        n--;
    }

    // 결과 계산 (남은 작업량의 제곱합)
    return works.reduce((acc, work) => acc + work ** 2, 0);
}
