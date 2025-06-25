class Queue {
    constructor(){
        this.store = {};
        this.front = 0;
        this.rear = 0;
    }

    size(){
        return this.rear - this.front;  // ❗반환이 빠졌던 부분
    }

    push(value){
        this.store[this.rear++] = value;  // ❗소괄호 → 대괄호
    }

    popleft(){
        if (this.size() === 0) return undefined;

        const temp = this.store[this.front];
        delete this.store[this.front];
        this.front++;

        return temp;
    }
}


function solution(n, edge) {
    const connects = new Array(n).fill().map(_ => []);
    
    for(const e of edge){
        connects[e[0] - 1].push(e[1] - 1);
        connects[e[1] - 1].push(e[0] - 1);
    }
    
    const visited = [1];
    const queue = new Queue();
    queue.push(0);
    while(queue.size()){
        const cur = queue.popleft();
        
        for(const next of connects[cur]){
            if(!visited[next]){
                visited[next] = visited[cur] + 1;
                queue.push(next);
            }
        }
    }
    
    const max = Math.max(...visited);
    
    
    return visited.filter(el => el === max).length;  
}
