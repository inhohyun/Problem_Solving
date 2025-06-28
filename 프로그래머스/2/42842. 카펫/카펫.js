function solution(brown, yellow) {
    var answer = [];
    const total = brown + yellow;
    for(let y = 3; y <= total / y; y++){
        let x = Math.floor(total / y);
        
        // 정답인 조건
        if((x-2) * (y-2) === yellow){
            return [x,y];
        }
    }
    return answer;
}