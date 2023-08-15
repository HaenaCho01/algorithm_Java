package Programmers.lv1.prac_연습문제;

import java.util.Arrays;

public class P_서울에서_김서방_찾기 {

    public String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();
        answer.append("김서방은 ");
        answer.append(Arrays.asList(seoul).indexOf("Kim"));
        answer.append("에 있다");
        return answer.toString();
    }

/*
테스트 1 〉	통과 (0.11ms, 75.5MB)
테스트 2 〉	통과 (0.16ms, 77.5MB)
테스트 3 〉	통과 (0.16ms, 71.4MB)
테스트 4 〉	통과 (0.10ms, 72.8MB)
테스트 5 〉	통과 (0.16ms, 77MB)
테스트 6 〉	통과 (0.10ms, 72.8MB)
테스트 7 〉	통과 (0.10ms, 73.2MB)
테스트 8 〉	통과 (0.17ms, 85MB)
테스트 9 〉	통과 (0.10ms, 71.8MB)
테스트 10 〉	통과 (0.15ms, 73.3MB)
테스트 11 〉	통과 (0.17ms, 72.5MB)
테스트 12 〉	통과 (0.17ms, 89MB)
테스트 13 〉	통과 (0.14ms, 79.2MB)
테스트 14 〉	통과 (0.13ms, 76.3MB)
 */

    public String solution2(String[] seoul) {
        int x =  0;
        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) {
                x = i ;
                break;
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append("김서방은 ");
        answer.append(x);
        answer.append("에 있다");
        return answer.toString();
    }

/*
테스트 1 〉	통과 (0.09ms, 76.6MB)
테스트 2 〉	통과 (0.05ms, 74.4MB)
테스트 3 〉	통과 (0.07ms, 73MB)
테스트 4 〉	통과 (0.07ms, 74.9MB)
테스트 5 〉	통과 (0.07ms, 77.3MB)
테스트 6 〉	통과 (0.06ms, 72.5MB)
테스트 7 〉	통과 (0.06ms, 77MB)
테스트 8 〉	통과 (0.09ms, 72.7MB)
테스트 9 〉	통과 (0.05ms, 72.5MB)
테스트 10 〉	통과 (0.05ms, 72.2MB)
테스트 11 〉	통과 (0.09ms, 74.7MB)
테스트 12 〉	통과 (0.09ms, 73MB)
테스트 13 〉	통과 (0.08ms, 76.4MB)
테스트 14 〉	통과 (0.07ms, 77.2MB)
 */

    public static void main(String[] args) {
        P_서울에서_김서방_찾기 sol = new P_서울에서_김서방_찾기();
        System.out.println(sol.solution(new String[]{"Jane", "Kim"}));
        System.out.println(sol.solution2(new String[]{"Jane", "Kim"}));
    }
}
