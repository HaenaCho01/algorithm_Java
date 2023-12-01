package Programmers.lv0.pcce;

// 빈칸 채우기 문제

import java.util.Scanner;

public class P4_저축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money +=
                    before // 빈칸
            ;
            month++;
        }
        while (
                money // 빈칸
                        < 100) {

            money += after; // 빈칸
            ;
            month++;
        }

        System.out.println(month);
    }
}

/*
테스트 1 〉	통과 (150.70ms, 67.6MB)
테스트 2 〉	통과 (148.29ms, 66.5MB)
테스트 3 〉	통과 (135.05ms, 65.7MB)
테스트 4 〉	통과 (136.00ms, 68.7MB)
테스트 5 〉	통과 (148.01ms, 66.2MB)
테스트 6 〉	통과 (155.95ms, 63.2MB)
테스트 7 〉	통과 (175.77ms, 68.5MB)
테스트 8 〉	통과 (133.85ms, 66.8MB)
테스트 9 〉	통과 (159.95ms, 62.6MB)
테스트 10 〉	통과 (204.72ms, 65.8MB)
테스트 11 〉	통과 (193.38ms, 66.4MB)
테스트 12 〉	통과 (186.52ms, 70.6MB)
테스트 13 〉	통과 (200.16ms, 66.1MB)
테스트 14 〉	통과 (152.97ms, 64.2MB)
테스트 15 〉	통과 (153.98ms, 73.7MB)
테스트 16 〉	통과 (144.61ms, 70.4MB)
테스트 17 〉	통과 (143.29ms, 65.7MB)
테스트 18 〉	통과 (132.63ms, 68.5MB)
테스트 19 〉	통과 (164.36ms, 71.6MB)
테스트 20 〉	통과 (166.54ms, 69.1MB)
테스트 21 〉	통과 (145.50ms, 68.7MB)
테스트 22 〉	통과 (156.61ms, 64.2MB)
테스트 23 〉	통과 (155.66ms, 65.4MB)
테스트 24 〉	통과 (155.56ms, 66.4MB)
테스트 25 〉	통과 (154.58ms, 67.3MB)
테스트 26 〉	통과 (129.00ms, 66.7MB)
테스트 27 〉	통과 (140.85ms, 67.2MB)
테스트 28 〉	통과 (130.24ms, 68.4MB)
테스트 29 〉	통과 (128.99ms, 69.5MB)
테스트 30 〉	통과 (130.31ms, 66.3MB)
 */
