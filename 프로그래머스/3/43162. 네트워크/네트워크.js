function solution(n, computers) {
    let visited = [false];
    
    let answer = 0;
    
    function dfs(i){
        visited[i] = true;
        for(let j = 0; j < computers[i].length; j++){
            if(computers[i][j] === 1 && !visited[j])
            dfs(j);
        }
    }
    
    for(let i = 0; i< n; i++){
        if(!visited[i]){
            answer++;
            dfs(i)
        }
    }
        
    
    return answer;
}

