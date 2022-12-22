class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        	
		// for (int i = 0; i < str.length(); i++) {
		// 	if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
		// }
        for(i in 0..my_string.length-1){
            if(my_string.indexOf(my_string[i]) == i)
            answer += my_string[i]
        }
        return answer
    }
}