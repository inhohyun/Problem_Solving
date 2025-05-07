function solution(a) {
    let answer = 1; // 1개 이상은 살아남으므로 1로 초기화
    
    let min1_index = 0;
    let min2_index = a.length-1;
    
    
    let min1 = a[min1_index];
    let min2 = a[min2_index];
    
    while(min1_index < min2_index){
        if(min1 > min2){
            if(min1 > a[++min1_index]){
              answer++;    
                min1 = a[min1_index];
              
            }
            
            
        }
        
        if(min1 < min2){
            if( min2 > a[--min2_index]){
                answer++;    
                min2 = a[min2_index];
              
            }
        }
    }
    
    return answer;
}