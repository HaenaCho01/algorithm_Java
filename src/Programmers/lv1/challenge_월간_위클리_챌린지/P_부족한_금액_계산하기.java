package Programmers.lv1.challenge_월간_위클리_챌린지;

public class P_부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long pay = 0;
        for (int i = 1; i <= count; i++) {
            pay += (long) price * i;
        }
        return money < pay ? pay - money : 0;
    }

/*
테스트 1 〉	통과 (0.05ms, 79.2MB)
테스트 2 〉	통과 (0.16ms, 74.3MB)
테스트 3 〉	통과 (0.07ms, 82.8MB)
테스트 4 〉	통과 (0.09ms, 76.9MB)
테스트 5 〉	통과 (0.09ms, 73.5MB)
테스트 6 〉	통과 (0.05ms, 74MB)
테스트 7 〉	통과 (0.06ms, 73.7MB)
테스트 8 〉	통과 (0.04ms, 74.6MB)
테스트 9 〉	통과 (0.05ms, 73.2MB)
테스트 10 〉	통과 (0.05ms, 72.4MB)
테스트 11 〉	통과 (0.06ms, 73.9MB)
테스트 12 〉	통과 (0.07ms, 75.6MB)
테스트 13 〉	통과 (0.06ms, 71.8MB)
테스트 14 〉	통과 (0.09ms, 78.7MB)
테스트 15 〉	통과 (0.10ms, 75.9MB)
테스트 16 〉	통과 (0.06ms, 74.4MB)
테스트 17 〉	통과 (0.09ms, 79.5MB)
테스트 18 〉	통과 (0.10ms, 70.6MB)
테스트 19 〉	통과 (0.14ms, 63.7MB)
테스트 20 〉	통과 (0.09ms, 84.4MB)
테스트 21 〉	통과 (0.12ms, 74.1MB)
테스트 22 〉	통과 (0.10ms, 74.9MB)
테스트 23 〉	통과 (0.11ms, 70.7MB)
 */

    public static void main(String[] args) {
        P_부족한_금액_계산하기 sol = new P_부족한_금액_계산하기();
        System.out.println(sol.solution(3, 20, 4));
    }
}
