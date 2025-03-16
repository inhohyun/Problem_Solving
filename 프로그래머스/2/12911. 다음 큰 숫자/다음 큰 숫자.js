function solution(n) {
    var answer = 0;
    const bin_one_cnt = n.toString(2).split(1).length - 1;
    let temp = n + 1;
    while (true){
        let bin_temp = temp.toString(2).split(1).length - 1;
        
        if(bin_one_cnt === bin_temp){
            return temp;
        }
        
        temp++;
    }
    return answer;
}