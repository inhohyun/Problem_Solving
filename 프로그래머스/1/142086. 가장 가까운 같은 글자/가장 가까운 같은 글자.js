function solution(s) {
    var answer = [];
    let temp = {};
    let arr_s = Array.from(s);
    
    arr_s.forEach((value, index) => {
        const isNone = index === 0 || temp[value] === undefined;
        // 없는 경우
        if(isNone){
            answer.push(-1);
        }
        // 있는 경우   
        else{ 
            answer.push(index - temp[value]);
        }
              temp[value] = index;
        
         
    });
    return answer;
}