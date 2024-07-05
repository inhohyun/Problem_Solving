function solution(skill, skill_trees) {
    var answer = 0;
    
    skill_trees.forEach((value) =>{
        //skill에 없는 스킬은 제거하기
        let temp = value.split('').filter(char => skill.includes(char)).join('');
        // console.log(temp);
        
        //순서
        if(skill.indexOf(temp) === 0){
            answer++;
        }
    })
    return answer;
}