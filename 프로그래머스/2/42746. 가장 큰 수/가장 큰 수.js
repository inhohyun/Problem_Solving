function solution(numbers) {
    var answer = '';
    
    // 숫자 배열을 문자열로 변환한 후 내림차순 정렬
    let sorted_numbers = numbers.sort((a, b) => {
        // 두 수를 문자열로 변환하여 붙였을 때 어떤 순서가 더 큰 수를 만드는지를 비교
        let order1 = a.toString() + b.toString();
        let order2 = b.toString() + a.toString();
        return order2 - order1; // 내림차순 정렬
    });

    // 정렬된 숫자들을 문자열로 이어붙이기
    answer = sorted_numbers.join('');

    // 예외 처리: '000...0'인 경우 '0' 반환
    if (answer[0] === '0') return '0';

    return answer;
}
