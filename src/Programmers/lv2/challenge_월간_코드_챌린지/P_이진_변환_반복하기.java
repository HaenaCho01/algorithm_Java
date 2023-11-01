package Programmers.lv2.challenge_월간_코드_챌린지;

public class P_이진_변환_반복하기 {
    class Solution {
        public int[] solution(String s) {
            // 변환 횟수, 제거된 0의 개수 담을 변수 선언
            int loop = 0; int removed = 0;

            // s가 1이 될 때까지 반복
            while (!s.equals("1")) {
                // 0의 개수와 제거 횟수 누적
                int zeros = countZeros(s);
                loop += 1;
                removed += zeros;

                // 문자열 s 변환 - 나머지 1의 개수를 사용해서 2진법으로 변환
                int ones = s.length() - zeros;
                s = Integer.toString(ones, 2);
            }

            return new int[] {loop, removed};
        }

        // 문자열에 포함된 0의 개수 세기
        private int countZeros(String s) {
            int zeros = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') zeros++;
            }
            return zeros;
        }
    }
}

/*
테스트 1 〉	통과 (0.04ms, 76.8MB)
테스트 2 〉	통과 (4.03ms, 77.7MB)
테스트 3 〉	통과 (0.03ms, 73.2MB)
테스트 4 〉	통과 (0.03ms, 78.8MB)
테스트 5 〉	통과 (0.04ms, 73.7MB)
테스트 6 〉	통과 (0.07ms, 74.3MB)
테스트 7 〉	통과 (0.09ms, 78.1MB)
테스트 8 〉	통과 (0.06ms, 73.2MB)
테스트 9 〉	통과 (4.61ms, 74MB)
테스트 10 〉	통과 (4.08ms, 79.5MB)
테스트 11 〉	통과 (3.50ms, 82.9MB)
 */
