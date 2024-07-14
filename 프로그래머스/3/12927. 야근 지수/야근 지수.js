function solution(n, works) {
    // 총 작업량을 계산
    let total = works.reduce((prev, curr) => prev + curr, 0);
    
    // 작업량이 n 이하이면 모든 작업을 끝낼 수 있으므로 0 반환
    if (total <= n) {
        return 0;
    }
    
    // 내림차순으로 정렬
    works.sort((a, b) => b - a);
    
    // 남은 작업량을 처리
    while (n > 0) {
        works[0]--;
        n--;
        
        // 정렬된 배열에서 첫 번째 작업이 두 번째 작업보다 작아지면 재정렬
        for (let i = 0; i < works.length - 1; i++) {
            if (works[i] < works[i + 1]) {
                [works[i], works[i + 1]] = [works[i + 1], works[i]];
            } else {
                break;
            }
        }
    }
    
    // 남은 작업량의 제곱 합을 계산
    let answer = works.reduce((sum, work) => sum + work * work, 0);
    
    return answer;
}
