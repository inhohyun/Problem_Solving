function solution(numbers) {
    var answer = [];
    
    for(let i = 0; i < numbers.length; i++){
        for(let j = i+1; j < numbers.length; j++){
            let sum = numbers[i] + numbers[j];
            
            answer.push(sum);
        }
    }
    const result = [...new Set(answer)];
    result.sort((a,b) => {
        return a-b;
    });
  
    return result;
}