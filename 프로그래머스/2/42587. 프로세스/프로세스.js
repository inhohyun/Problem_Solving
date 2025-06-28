function solution(priorities, location) {
    var answer = 0;
    let arr = priorities.map((value, index)=>{
        if(index === location){
            return [value, true];
        }else{
            return [value, false];
        }
    });
    
    while(arr.length){
        let current = arr.shift();
        let hasHigher = arr.some(item => item[0] > current[0]);
        
        // 우선순위가 더 높은게 있을 경우
        if(hasHigher){
            // 얌전히 다시 넣기
            arr.push(current);
        }else{
            // 빼도 되는 값일 경우
            answer++;
            // 찾는 값일 경우
            if(current[1]){
                return answer;
            }
        }
        
        
    }
    return answer;
}