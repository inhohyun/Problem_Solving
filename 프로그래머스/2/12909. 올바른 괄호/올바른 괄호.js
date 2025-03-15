function solution(s){
    var answer = true;
    let stack = []
    
    let arr_s = s.split("");
    if(arr_s[0] == ')'){
        return false;
    }
    arr_s.forEach((a) =>{
        // 여는 괄호일 떄
       if(a == '('){
           stack.push(a);
                       
       } 
        // 닫는 괄호일 때
        else{
          if(stack.length == 0){
              return false;
          }else{
              stack.pop();
          }
       }
    });
    
    if(stack.length == 0){
        return true;
    }
    return false;
}