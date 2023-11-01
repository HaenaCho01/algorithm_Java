package Programmers.lv2.challenge_월간_코드_챌린지;

public class P_삼각_달팽이 {
    class Solution {
        public int[] solution(int n) {
            // 삼각형 -> 2차원 배열 및 채울 숫자 선언
            int[][] triangle = new int[n][n];
            int num = 1;

            // 위치 변수 선언
            int x = 0;
            int y = 0;

            // 방향에 따라 이동할 수 없을 때까지 반복하면서 숫자 채우기
            while (true) {
                // 아래 이동
                while (true) {
                    triangle[y][x] = num++;
                    if (y + 1 == n || triangle[y + 1][x] != 0) break;
                    y += 1;
                }
                if (x + 1 == n || triangle[y][x + 1] != 0) break;
                x += 1;

                // 오른쪽 이동
                while (true) {
                    triangle[y][x] = num++;
                    if (x + 1 == n || triangle[y][x + 1] != 0) break;
                    x += 1;
                }
                if (triangle[y - 1][x - 1] != 0) break;
                x -= 1;
                y -= 1;

                // 왼쪽 위 이동
                while (true) {
                    triangle[y][x] = num++;
                    if (triangle[y - 1][x - 1] != 0) break;
                    x -= 1;
                    y -= 1;
                }
                if (y + 1 == n || triangle[y + 1][x] != 0) break;
                y += 1;
            }

            // 1차원 배열로 옮기기
            int[] result = new int[num - 1];
            int index = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    result[index++] = triangle[i][j];
                }
            }

            return result;
        }
    }
}

/*
테스트 1 〉	통과 (0.03ms, 75.7MB)
테스트 2 〉	통과 (0.02ms, 69.3MB)
테스트 3 〉	통과 (0.02ms, 70.1MB)
테스트 4 〉	통과 (0.27ms, 79.7MB)
테스트 5 〉	통과 (0.44ms, 76.5MB)
테스트 6 〉	통과 (0.49ms, 86.5MB)
테스트 7 〉	통과 (30.64ms, 130MB)
테스트 8 〉	통과 (23.35ms, 142MB)
테스트 9 〉	통과 (18.77ms, 123MB)
 */
