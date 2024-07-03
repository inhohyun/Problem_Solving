function solution(number, k) {
    let arr = [];
    for(let i = 0; i < number.length; i++){
        while(arr.length > 0 && number[i] > arr[arr.length-1] && k > 0){
            k--;
            arr.pop();
        }
        arr.push(number[i])
    }
    
    //k가 남았을 경우 -> 뒤에서 k 만큼 제거
    arr.splice(arr.length - k ,k)
    return arr.join("");
}