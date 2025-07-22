// 큐 클래스 정의
class Queue {
    constructor() {
        this.store = {};
        this.front = 0;
        this.end = 0;
    }

    push(value) {
        this.store[this.end++] = value;
    }

    popleft() {
        if (this.front === this.end) return undefined;
        const value = this.store[this.front];
        delete this.store[this.front++];
        return value;
    }

    isEmpty() {
        return this.front === this.end;
    }
}

// 최단거리 탐색 함수 (BFS)
function solution(maps) {
    const n = maps.length;
    const m = maps[0].length;

    const visited = Array.from({ length: n }, () => Array(m).fill(false));
    const distance = Array.from({ length: n }, () => Array(m).fill(0));

    const dx = [1, 0, -1, 0];
    const dy = [0, 1, 0, -1];

    const q = new Queue();
    q.push([0, 0]);
    visited[0][0] = true;
    distance[0][0] = 1;

    while (!q.isEmpty()) {
        const [x, y] = q.popleft();

        for (let i = 0; i < 4; i++) {
            const nx = x + dx[i];
            const ny = y + dy[i];

            // 범위 체크 및 조건 확인
            if (
                nx >= 0 && nx < n &&
                ny >= 0 && ny < m &&
                maps[nx][ny] === 1 &&
                !visited[nx][ny]
            ) {
                visited[nx][ny] = true;
                distance[nx][ny] = distance[x][y] + 1;
                q.push([nx, ny]);
            }
        }
    }

    // 도착지점까지의 거리 반환, 도달 불가능 시 -1
    return distance[n - 1][m - 1] === 0 ? -1 : distance[n - 1][m - 1];
}
