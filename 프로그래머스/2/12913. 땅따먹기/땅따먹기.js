function solution(land) {
    let data = [...land];
    const len = data.length;
    var answer = 0;
    // 이전행의 최댓값 누적해서 더하기
    for(let i = 0; i< data.length-1; i++){
        data[i+1][0] += Math.max(data[i][1], data[i][2], data[i][3]);
                                                      
data[i+1][1] += Math.max(data[i][0], data[i][2], data[i][3]);
                                              data[i+1][2] += Math.max(data[i][0], data[i][1],data[i][3]);
                                                                                            data[i+1][3] += Math.max(data[i][0], data[i][1], data[i][2]);
                                                      
    }
const max_value = Math.max(data[len-1][0], data[len-1][1], data[len-1][2], data[len-1][3])
   

    return max_value;
}