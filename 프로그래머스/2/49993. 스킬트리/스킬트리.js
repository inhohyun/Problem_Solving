function solution(skill, skill_trees) {
    var answer = 0;
    
    // 각 스킬 트리를 검사합니다.
    skill_trees.forEach((value) => {
        // skill 순서대로만 나오는 문자열을 만듭니다.
        let filteredSkillTree = value.split('').filter(char => skill.includes(char)).join('');
        
        // skill의 앞부분과 일치하는지 확인합니다.
        if (skill.indexOf(filteredSkillTree) === 0) {
            answer++;
        }
    });
    
    return answer;
}
