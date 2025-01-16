function solution(n) {
    var answer = 0;
    let cnt = n; 
    // 하나씩 증가시키며 조건과 맞으면 return
    while (true) {
        cnt++;
        if(countOne(toBin(cnt)) === countOne(toBin(n))){
            return cnt;
        }
    }
    return answer;
}
 //이진수로 변환하는 함수   
function toBin(num) {
    return num.toString(2);
}
    
function countOne (str) {
    return str.split('1').length - 1;
}