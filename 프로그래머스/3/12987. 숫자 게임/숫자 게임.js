function solution(A, B) {
    //최대 승점 조건 : 최소한의 격차로 이기기?
    // n ** 2으로하면 시초
    let number_a = A.sort((a,b) => a-b);
    let number_b = B.sort((a,b) => a-b);
    var answer = 0;
       let j = 0;
    for(let i = 0; i < A.length; i++){
     
        while(1){
            if(j === B.length) break;
            if(number_a[i] < number_b[j]){
                answer++;
                j++;
                break;
            }
            else {
                j++;
            }
        }
    }
    
    return answer;
}