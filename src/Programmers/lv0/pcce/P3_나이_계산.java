package Programmers.lv0.pcce;

/*
빈칸 채우기 문제 안내
빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
빈칸을 제외한 기본 코드는 수정할 수 없습니다.
빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.
 */

import java.util.Scanner;

public class P3_나이_계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals(
                "Korea" // 빈칸
        )) {
            answer =
                    2030 - year + 1 // 빈칸
            ;
        } else if (age_type.equals("Year")) {

            answer = 2030 - year // 빈칸
            ;
        }

        System.out.println(answer);
    }

}

/*
테스트 1 〉	통과 (177.52ms, 64.3MB)
테스트 2 〉	통과 (148.61ms, 67.5MB)
테스트 3 〉	통과 (156.93ms, 63.2MB)
테스트 4 〉	통과 (138.29ms, 64.7MB)
테스트 5 〉	통과 (130.53ms, 65.8MB)
테스트 6 〉	통과 (163.63ms, 70.7MB)
테스트 7 〉	통과 (154.61ms, 68.1MB)
테스트 8 〉	통과 (157.33ms, 70.3MB)
테스트 9 〉	통과 (154.82ms, 68.5MB)
테스트 10 〉	통과 (170.47ms, 70MB)
테스트 11 〉	통과 (146.36ms, 62.6MB)
테스트 12 〉	통과 (146.80ms, 70.8MB)
테스트 13 〉	통과 (172.12ms, 68.7MB)
테스트 14 〉	통과 (137.02ms, 66.1MB)
테스트 15 〉	통과 (129.30ms, 64.6MB)
테스트 16 〉	통과 (130.62ms, 65MB)
테스트 17 〉	통과 (125.71ms, 66.3MB)
테스트 18 〉	통과 (137.31ms, 67.8MB)
테스트 19 〉	통과 (143.88ms, 65.5MB)
테스트 20 〉	통과 (134.17ms, 71.6MB)
테스트 21 〉	통과 (169.32ms, 67.6MB)
테스트 22 〉	통과 (136.70ms, 68.6MB)
테스트 23 〉	통과 (155.66ms, 69.5MB)
테스트 24 〉	통과 (152.53ms, 66.6MB)
테스트 25 〉	통과 (158.67ms, 62.6MB)
테스트 26 〉	통과 (141.16ms, 67.1MB)
테스트 27 〉	통과 (160.30ms, 66MB)
테스트 28 〉	통과 (153.43ms, 65.5MB)
테스트 29 〉	통과 (130.81ms, 70.2MB)
테스트 30 〉	통과 (129.94ms, 64.4MB)
 */
