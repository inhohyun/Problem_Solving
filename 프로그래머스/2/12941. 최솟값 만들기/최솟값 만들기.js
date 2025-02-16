function solution(A,B){
    
    let sorted_a = A.sort((a, b) => a - b);
    let sorted_b = B.sort((a, b) => b - a);
    
    const answer = sorted_a.reduce((sum, val, index) => sum + val * sorted_b[index], 0);
    return answer;
}