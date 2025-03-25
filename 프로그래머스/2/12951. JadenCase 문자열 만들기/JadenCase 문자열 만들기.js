function solution(s) {
    // 소문자로 먼저 전체 변환 (대소문자 섞여있을 수 있으므로)
    s = s.toLowerCase();

    // 공백 기준으로 쪼갠다 (공백 유지 위해 split(" ") 사용)
    let words = s.split(" ");

    let jadenCaseWords = words.map(word => {
        if (word.length === 0) return ""; // 빈 문자열은 그대로 반환
        return word[0].toUpperCase() + word.slice(1);
    });

    // 공백 유지하려면 join(" ") 해야 함
    return jadenCaseWords.join(" ");
}
