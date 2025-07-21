function solution(s)
{
    // stack 활용
    let stack = [];
    for(let char of s){
        if(stack.length > 0 && stack[stack.length-1] === char){
            stack.pop();
        } else{
            stack.push(char);
        }
    }
    

    return stack.length === 0 ? 1 : 0;
}