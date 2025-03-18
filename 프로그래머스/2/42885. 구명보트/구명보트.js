function solution(people, limit) {
    let cnt = 0;
    let sorted_people = people.sort();
    let index = 0;
    for(let i = sorted_people.length- 1; i >= index ; i--){
       if(sorted_people[i] + sorted_people[index] <= limit){
           index++;
       }
        
        cnt++;
    }
    
    return cnt;
}