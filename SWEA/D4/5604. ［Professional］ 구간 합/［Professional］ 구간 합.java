

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static long[] countArray;
    static long startNumber, endNumber, multiplier;

    // 각 자리 숫자의 등장 횟수를 계산하는 메소드
    static void calculateCounts(long currentNumber) {
        // 현재 숫자를 자리수마다 분리하여 등장 횟수 계산
        for (long i = currentNumber; i > 0; i /= 10) {
            String numString = Long.toString(i);
            int digit = numString.charAt(numString.length() - 1) - '0';
            countArray[digit] += multiplier;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine().trim());

        for (int testCase = 1; testCase <= testCases; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            startNumber = Long.parseLong(st.nextToken());
            endNumber = Long.parseLong(st.nextToken());

            // 각 자리 숫자의 등장 횟수를 저장할 배열 초기화
            countArray = new long[10];
            long result = 0;
            multiplier = 1;

            // 시작 숫자가 0인 경우 0은 카운트되지 않으므로 1부터 시작하도록 조정
            if (startNumber == 0) startNumber = 1;

            // 시작 숫자부터 끝 숫자까지 반복하며 각 자리 숫자의 등장 횟수 계산
            while (startNumber <= endNumber) {
                // 시작 숫자가 10으로 나누어 떨어지지 않는 경우
                while (startNumber % 10 != 0 && startNumber <= endNumber) {
                    calculateCounts(startNumber);
                    startNumber++;
                }

                // 끝 숫자가 9로 나누어 떨어지지 않는 경우
                if (startNumber > endNumber) break;
                while (endNumber % 10 != 9 && startNumber <= endNumber) {
                    calculateCounts(endNumber);
                    endNumber--;
                }

                // 현재 자릿수를 제거하고 자릿수를 한 단계씩 줄임
                long digitDifference = endNumber / 10 - startNumber / 10 + 1;
                for (int i = 0; i < 10; i++)
                    countArray[i] += digitDifference * multiplier;

                // 다음 자릿수로 이동
                multiplier *= 10;
                startNumber /= 10;
                endNumber /= 10;
            }

            // 각 자리 숫자의 등장 횟수에 따른 결과 계산
            for (int i = 1; i < 10; i++)
                result += (i * countArray[i]);

            // 결과 출력
            System.out.println("#" + testCase + " " + result);
        }
    }
}
