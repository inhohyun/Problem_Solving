function solution(n, computers) {
    let answer = 0;
    let visited = [false];
    
    const dfs = (depth) => {
        visited[depth] = true;     
        for(let i = 0; i< n; i++){   
            if(computers[depth][i] && !visited[i]){
                dfs(i);       
               }
        }
        
    }
    for(let i = 0; i < n; i++){
        if(!visited[i]){
            dfs(i)
            answer++;
        }
    }
    return answer;
}
