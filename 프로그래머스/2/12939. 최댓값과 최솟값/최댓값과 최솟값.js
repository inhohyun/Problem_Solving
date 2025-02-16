function solution(s) {
    var answer = '';
    const arr_s = s.split(' ');
    
    const sorted_arr_s = arr_s.sort((a, b) => a - b);
    console.log(sorted_arr_s)
    return `${sorted_arr_s[0]} ${sorted_arr_s[sorted_arr_s.length-1]}`;
}