function solution(s) {
    
    let removeZeroCnt = 0; // 제거한 0의 개수
    let repeatCnt = 0; // 반복한 횟수
    
    while(true){
        // 1이 될 때까지 반복
        if(s === '1'){
            break;
        }
        
        
        let arr_s = [...s];
        
       
        const arr_s_temp = arr_s.map((value, index) => {
            if(value === '0'){
                removeZeroCnt++;
            }else{
                return '1';
            }
        })
         //0을 제거한 문자열
        
        
        // 2진수 변환
        s = parseInt(arr_s_temp.join('').length).toString(2);
        repeatCnt++;
    }
    
    
    return [repeatCnt, removeZeroCnt];
}