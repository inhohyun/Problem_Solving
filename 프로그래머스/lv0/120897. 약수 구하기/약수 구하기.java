import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] arr = new int[10000];
        int index = 0;
        //다른 크기의 arr 배열을 추가로 만든다?

        for(int i=1;i<=n;i++){
            if(n%i == 0){// i가 약수 일때
                arr[index] = i;
                index++;
            }
        }
        int[] answer = new int[index];
   for(int j=0;j<index;j++){
       if(arr[j] != 0){
           answer[j] = arr[j];
       }
   }
        return answer;
    }
}