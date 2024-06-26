function solution(board, moves) {
    var answer = 0;
    let backet = [];

    // 모든 moves 탐색하기
    for(let i = 0; i < moves.length; i++) {
        let move = moves[i] - 1; // moves는 1부터 시작하므로 인덱스를 맞추기 위해 1을 뺍니다.
        
        for(let j = 0; j < board.length; j++) {
    
            
            // 유효한 값을 만나면 해당 인형을 바구니에 넣고 board에서는 삭제
            if(board[j][move] != 0) { // moves[i]가 아닌 move 사용
                // 만약 바구니의 상단 값이랑 같은 인형일 경우 둘 다 삭제하고 answer + 2
                // 비어있으면 그냥 추가
                
                // backet.isEmpty()는 잘못된 메서드 호출입니다. 배열이 비어 있는지 확인하려면 backet.length === 0을 사용합니다.
                if(backet.length === 0) {
                    // backet.append()도 잘못된 메서드 호출입니다. 배열에 요소를 추가하려면 backet.push()를 사용해야 합니다.
                    backet.push(board[j][move]);
                    board[j][move] = 0;
                // backet.peek()도 잘못된 메서드 호출입니다. 배열의 마지막 요소를 확인하려면 backet[backet.length - 1]을 사용합니다.
                } else if(backet[backet.length - 1] == board[j][move]) {
                    answer += 2;
                    board[j][move] = 0;
                    backet.pop();
                } else {
                    backet.push(board[j][move]);
                    board[j][move] = 0;
                }
                
                break; // 인형을 집었으면 다음 move로 이동
            }
        }
    }
    return answer;
}
