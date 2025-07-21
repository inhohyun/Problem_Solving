function solution(want, number, discount) {
    let cnt = 0;
    let obj_want = {};
    
    want.forEach((value, index) =>{
       obj_want[value] = number[index]; 
    });
    
    for(let i = 0; i <= discount.length -10; i++){
        // 10일간 할인하는 품목 객체 생성
        const arr_temp = discount.slice(i, i+10);
        
        let obj_temp = {};
        arr_temp.forEach((value, index) => {
            
            if(obj_temp[value] == undefined){
               obj_temp[value] = 1;                
            } else{
            obj_temp[value] += 1;      
            }
           
        });
        
        // debug - obj_temp가 의도와 다르게 만들어짐
        
        // console.log(obj_temp);
        // 두 객체의 키벨류가 같은지 비교
        let isCheck = true;
        // console.log(obj_temp, i);
        for(let key in obj_temp){
            // console.log('obj_want[key]',obj_want[key]);
            // console.log('obj_temp[key]', obj_temp[key]);
            if(obj_want[key] != obj_temp[key]){
                isCheck = false;
                break;
            }
        }
        // 전품목을 할인 받아서 샀으면 가능한 날짜 개수 추가
        if(isCheck){
            cnt++;
        }
                                 
    }
    return cnt;
}