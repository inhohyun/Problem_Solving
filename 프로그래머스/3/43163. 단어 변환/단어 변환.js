function solution(begin, target, words) {
    let min_count = Number.MAX_SAFE_INTEGER;

    // words에 target이 포함되어 있지 않으면 0을 반환
    if (!words.includes(target)) {
        return 0;
    }

    const dfs = (temp, count, visited) => {
        if (temp === target) {
            min_count = Math.min(min_count, count);
            return;
        }

        for (let i = 0; i < words.length; i++) {
            if (!visited[i]) {
                let diffCount = 0;
                for (let j = 0; j < temp.length; j++) {
                    if (temp[j] !== words[i][j]) {
                        diffCount++;
                    }
                }

                // 단어가 하나의 문자만 다를 때
                if (diffCount === 1) {
                    visited[i] = true;
                    dfs(words[i], count + 1, visited);
                    visited[i] = false;
                }
            }
        }
    }

    dfs(begin, 0, new Array(words.length).fill(false));

    return min_count === Number.MAX_SAFE_INTEGER ? 0 : min_count;
}