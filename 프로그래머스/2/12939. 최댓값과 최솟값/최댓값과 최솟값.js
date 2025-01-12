function solution(s) {
    var answer = '';
    let arr_s = s.split(" ");
    arr_s.sort((a, b) => a - b);
    // console.log(arr_s);
    let mi = arr_s[0];
    let ma = arr_s[arr_s.length - 1];
    
    return `${mi} ${ma}`;
}