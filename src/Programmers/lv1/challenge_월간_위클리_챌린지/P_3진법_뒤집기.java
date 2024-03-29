package Programmers.lv1.challenge_월간_위클리_챌린지;

import java.util.ArrayList;
import java.util.List;

class SolutionTernaryBase3Reverse {
    public int solution(int n) {
        // 뒤집어진 3진법 구하기
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 3);
            n /= 3;
        }

        // 뒤집어진 3진법을 순서대로 돌면서 답을 구하기
        int answer = 0;
        for (int i = 0, j = list.size() - 1; i < list.size(); i++, j--) {
            answer += Math.pow(3, j) * list.get(i);
        }
        return answer;
    }

    /*
        테스트 1 〉	통과 (0.10ms, 72.3MB)
        테스트 2 〉	통과 (0.05ms, 76.2MB)
        테스트 3 〉	통과 (0.04ms, 74.5MB)
        테스트 4 〉	통과 (0.04ms, 73.3MB)
        테스트 5 〉	통과 (0.05ms, 75.6MB)
        테스트 6 〉	통과 (0.04ms, 69.8MB)
        테스트 7 〉	통과 (0.05ms, 76.3MB)
        테스트 8 〉	통과 (0.05ms, 75.6MB)
        테스트 9 〉	통과 (0.04ms, 77.7MB)
        테스트 10 〉	통과 (0.04ms, 72.3MB)
     */

    public int solution2(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n,3));
        return Integer.parseInt(sb.reverse().toString(),3);
    }

     /*
        테스트 1 〉	통과 (0.06ms, 77.9MB)
        테스트 2 〉	통과 (0.07ms, 76.1MB)
        테스트 3 〉	통과 (0.04ms, 75.3MB)
        테스트 4 〉	통과 (0.06ms, 73MB)
        테스트 5 〉	통과 (0.05ms, 77.5MB)
        테스트 6 〉	통과 (0.05ms, 73.1MB)
        테스트 7 〉	통과 (0.04ms, 71.3MB)
        테스트 8 〉	통과 (0.06ms, 87.4MB)
        테스트 9 〉	통과 (0.05ms, 72.4MB)
        테스트 10 〉	통과 (0.04ms, 75.4MB)
     */

}




public class P_3진법_뒤집기 {
    public static void main(String[] args) {
        SolutionTernaryBase3Reverse sol = new SolutionTernaryBase3Reverse();
        System.out.println(sol.solution(45));
        System.out.println(sol.solution2(125));
    }
}
