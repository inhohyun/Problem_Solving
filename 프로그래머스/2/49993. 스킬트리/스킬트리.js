function solution(skill, skill_trees) {
    
    
    const req = {};
    skill.split('').forEach((char)=>  req[char] = true);
    
    const answer = skill_trees.filter((char)=> {
        
        // 순서 스킬만 필터링된 스킬트리
        const filtered_char = char.split('').filter((c) =>{
            return req[c];
        }).join('');
        
        return skill.startsWith(filtered_char);
    }).length;
    return answer;
}