function solution(n) {
    var answer = 0;
    let arr = [];
    for(let i = 0; i <=n; i += 2){
        arr.push(i);
    }
    console.log(arr)
    return arr.reduce((a,b) => a+b);
}