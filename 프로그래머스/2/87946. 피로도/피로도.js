let max_result = 0;

function solution(k, dungeons) {
    const visited = Array(dungeons.length).fill(false);
    dfs(k, dungeons, visited, 0);
    return max_result;
}

function dfs(k, dungeons, visited, result) {
    max_result = Math.max(max_result, result);

    for (let i = 0; i < dungeons.length; i++) {
        const [min_required, cost] = dungeons[i];
        if (!visited[i] && k >= min_required) {
            visited[i] = true;
            dfs(k - cost, dungeons, visited, result + 1);
            visited[i] = false;
        }
    }
}
