function solution(people, limit) {
    let cnt = 0;
    let index = 0;  
    people.sort((a,b) => a - b);
    for(let i = people.length- 1; i >= index ; i--){
       if(people[i] + people[index] <= limit){
           index++;
       }
        
        cnt++;
    }
    
    return cnt;
}