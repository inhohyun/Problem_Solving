function solution(number, k) {
    var answer = '';
    let stack = [];
    // 1. stack으로 다음에 더 큰 수가 있을 경우 stack에서 제거하도록 구현
    // 2. stack의 남아있는 원소가 가장 큰 수임
    for(let i = 0; i < number.length; i++){
        let temp = number[i];
        while(k > 0 && stack.length > 0 && stack[stack.length - 1] < temp){
            stack.pop();
            k--;
        }
        
        
        stack.push(temp);
    }
    
    return stack.slice(0, stack.length-k).join("");
}