package Programmers.lv1.prac_연습문제;

public class P_기사단원의_무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            // 약수 개수 구하는 메소드
            int cntDivisor = 0;
            // 약수의 개수를 전체로 구해서 돌리면 시간 초과로 실패하므로 주의!
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0) cntDivisor += 2;
                if(j * j == Math.sqrt(i) * Math.sqrt(i)) cntDivisor--;
            }
            // 제한 수치 체크 후 더하기
            if (cntDivisor > limit) answer += power;
            else answer += cntDivisor;
        }
        
        return answer;
    }

/*
테스트 1 〉	통과 (8.90ms, 81.5MB)
테스트 2 〉	통과 (3.44ms, 79.7MB)
테스트 3 〉	통과 (1.42ms, 83.5MB)
테스트 4 〉	통과 (4.22ms, 68.2MB)
테스트 5 〉	통과 (1.08ms, 85.1MB)
테스트 6 〉	통과 (10.84ms, 79.3MB)
테스트 7 〉	통과 (3.70ms, 73.4MB)
테스트 8 〉	통과 (2.44ms, 75.5MB)
테스트 9 〉	통과 (8.75ms, 73.4MB)
테스트 10 〉	통과 (1.64ms, 76.1MB)
테스트 11 〉	통과 (158.59ms, 75.2MB)
테스트 12 〉	통과 (165.28ms, 90.9MB)
테스트 13 〉	통과 (159.62ms, 83.7MB)
테스트 14 〉	통과 (156.46ms, 84.8MB)
테스트 15 〉	통과 (171.54ms, 79.3MB)
테스트 16 〉	통과 (176.36ms, 96.1MB)
테스트 17 〉	통과 (0.02ms, 77.7MB)
테스트 18 〉	통과 (175.67ms, 92MB)
테스트 19 〉	통과 (3.38ms, 70.5MB)
테스트 20 〉	통과 (5.92ms, 74.6MB)
테스트 21 〉	통과 (0.04ms, 81.8MB)
테스트 22 〉	통과 (0.02ms, 75.9MB)
테스트 23 〉	통과 (0.04ms, 77.1MB)
테스트 24 〉	통과 (176.54ms, 79.6MB)
테스트 25 〉	통과 (177.25ms, 93.7MB)
테스트 26 〉	통과 (0.84ms, 76.4MB)
테스트 27 〉	통과 (0.90ms, 80.3MB)
 */

    public static void main(String[] args) {
        P_기사단원의_무기 sol = new P_기사단원의_무기();
        System.out.println(sol.solution(5, 3, 2));
        System.out.println(sol.solution(10, 3, 2));
    }
}
