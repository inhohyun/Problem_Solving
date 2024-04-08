

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] scores = new int[1000001];
    static int[] cards = new int[1000001];

    public static void main(String[] args) throws  IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
       
       int n = Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine());
       int[] numbers = new int[n];
       
       int[] cards = new int[1000001];
       
       int[] score = new int[1000001];
       
       for(int i = 0; i < n; i++) {
    	   numbers[i] = Integer.parseInt(st.nextToken());   
       }
       
       for(int i : numbers) {
    	   cards[i] = 1; 
       }
       
       for(int i = 0; i < n; i++) {
    	   
    	   for(int j = numbers[i] * 2; j < 1000001; j += numbers[i]) {
    		   //배수가 존재하면 듀얼
    		   if(cards[j] == 1) {
    			   score[numbers[i]]++; // 승리
    			   score[j]--; // 패배
    			   
    		   }
    	   }
       }
       
       StringBuilder sb = new StringBuilder();
       
       for(int i = 0; i < n; i++) {
    	   
    		   sb.append(score[numbers[i]]+" ");
    	   
       }
       
       
       System.out.println(sb);
     
    }
}
