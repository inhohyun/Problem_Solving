function solution(numbers) {
    // 누적 합계를 계산
    const total = numbers.reduce((acc, cur) => {
        return acc + cur;
    }, 0);
    
    // 평균을 계산해서 반환
    return total / numbers.length;
}
