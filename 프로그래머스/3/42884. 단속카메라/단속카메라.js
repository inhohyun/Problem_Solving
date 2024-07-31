function solution(routes) {
    let answer = 0;
    let preCamera = -30001;
    
    //정렬
    let sorted_r = routes.slice().sort((a, b) =>{
         
            return a[1] - b[1];
        
    });
    
    sorted_r.forEach((value, index) => {
        if(value[0] > preCamera){
            answer++;
            preCamera = value[1];
        }
    })
    return answer;
}