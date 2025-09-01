function solution(numbers) {
    var answer = [];
    
    for(let i = 0; i < numbers.length; i++){
        for(let j = i+1; j < numbers.length; j++){
            let sum = numbers[i] + numbers[j];
            
            let check = true;
            for(let k = 0; k < answer.length; k++){
                if(answer[k] === sum){
                    check = false;
                }
            }
            
            if(check) answer.push(sum);
        }
    }
    
    answer.sort((a,b) => {
        return a-b;
    });
  
    return answer;
}