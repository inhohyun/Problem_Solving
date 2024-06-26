function solution(board, moves) {
    let answer = 0;
    let basket = [];

    // 모든 moves 탐색하기
    moves.forEach(move => {
        let column = move - 1;

        // 각 move에 대해 board의 해당 열을 탐색하여 첫 번째 유효한 값을 찾기
        for (let row = 0; row < board.length; row++) {
            if (board[row][column] !== 0) {
                let pickedDoll = board[row][column];
                board[row][column] = 0;

                // 바구니의 상단 값과 비교하여 같은 인형이면 삭제, 아니면 추가
                if (basket.length > 0 && basket[basket.length - 1] === pickedDoll) {
                    basket.pop();
                    answer += 2;
                } else {
                    basket.push(pickedDoll);
                }
                break; // 인형을 집었으면 다음 move로 이동
            }
        }
    });

    return answer;
}
