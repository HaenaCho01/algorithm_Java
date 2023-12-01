package Programmers.lv0.pcce;

// 디버깅 문제
// 디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
// 1줄만 수정하여 버그를 고치세요.
// 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.

import java.util.Scanner;

public class P2_피타고라스의_정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        // 버그 - int b_square = c - a;
        int b_square = (c * c) - (a * a);

        System.out.println(b_square);
    }
}

/*
테스트 1 〉	통과 (162.10ms, 69.3MB)
테스트 2 〉	통과 (160.72ms, 61.9MB)
테스트 3 〉	통과 (151.82ms, 69MB)
테스트 4 〉	통과 (146.06ms, 67.9MB)
테스트 5 〉	통과 (149.70ms, 68.7MB)
테스트 6 〉	통과 (154.73ms, 64.4MB)
테스트 7 〉	통과 (158.36ms, 66.6MB)
테스트 8 〉	통과 (137.72ms, 68.1MB)
테스트 9 〉	통과 (164.80ms, 67.3MB)
테스트 10 〉	통과 (151.38ms, 71.1MB)
테스트 11 〉	통과 (136.75ms, 64.9MB)
테스트 12 〉	통과 (157.57ms, 65.5MB)
테스트 13 〉	통과 (128.09ms, 69.1MB)
테스트 14 〉	통과 (134.52ms, 64.7MB)
테스트 15 〉	통과 (147.69ms, 63.9MB)
테스트 16 〉	통과 (138.88ms, 65.4MB)
테스트 17 〉	통과 (130.73ms, 67.6MB)
테스트 18 〉	통과 (130.14ms, 66.5MB)
테스트 19 〉	통과 (129.09ms, 66.8MB)
테스트 20 〉	통과 (130.10ms, 64.4MB)
 */
