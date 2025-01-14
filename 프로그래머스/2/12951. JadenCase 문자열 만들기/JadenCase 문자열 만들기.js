function solution(s) {
    var answer = '';
    let arr_a = s.split(" ").map((item) => {
        // 배열의 첫 요소를 대문자로 치환하고 나머지를 소문자로 유지
        return item.charAt(0).toUpperCase() + item.slice(1).toLowerCase();
    });
    answer = arr_a.join(" "); // 변환된 배열을 공백으로 연결하여 문자열로 반환
    return answer;
}
