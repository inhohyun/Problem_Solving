function solution(my_string, alp) {
  
    let str = my_string.replace(alp, alp.toUpperCase());
    while(true){
        if(str.includes(alp)){
            str = str.replace(alp, alp.toUpperCase())    
        } else{
            break;
        }
    }
    return str;
}