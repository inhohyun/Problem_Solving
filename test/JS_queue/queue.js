class Queue {
    constructor(){
        this.store = {};
        this.front = 0;
        this.rear = 0;

    }

    size(){
        this.front - this.rear;
    }

    push(value){
        this.store[rear++] = value;
    }
    popleft(){
        let temp;
        temp = this.store[this.front]; 
        delete this.store[this.front];
        this.front++; // 맨 앞을 제거했으니 맨 앞을 하나 당겨주기

        return temp;
    }
}