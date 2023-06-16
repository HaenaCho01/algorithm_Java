package Programmers.lv0.codingTestBasicsTraining.day3_연산;

import java.util.Scanner;

public class Sol1_문자열_섞기 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        // 길이가 같은 문자열 str1, str2가 주어짐
        System.out.println(sol.solution("aaaaa", "bbbbb"));
    }

}

class Solution1 {
    public String solution(String str1, String str2) {
        // 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            str.append(str1.charAt(i));
            str.append(str2.charAt(i));
        }
        String answer = str.toString();
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.06ms, 90.1MB)
테스트 2 〉	통과 (0.02ms, 69.2MB)
테스트 3 〉	통과 (0.03ms, 73.8MB)
테스트 4 〉	통과 (0.03ms, 78.4MB)
테스트 5 〉	통과 (0.02ms, 80.9MB)
테스트 6 〉	통과 (0.02ms, 73.3MB)
테스트 7 〉	통과 (0.02ms, 73.1MB)
테스트 8 〉	통과 (0.02ms, 73.1MB)
테스트 9 〉	통과 (0.02ms, 72.9MB)
테스트 10 〉	통과 (0.03ms, 67.8MB)
테스트 11 〉	통과 (0.04ms, 77.3MB)
테스트 12 〉	통과 (0.04ms, 74.4MB)
테스트 13 〉	통과 (0.03ms, 72.8MB)
테스트 14 〉	통과 (0.05ms, 73.4MB)
테스트 15 〉	통과 (0.02ms, 76.7MB)
테스트 16 〉	통과 (0.04ms, 71.9MB)
테스트 17 〉	통과 (0.03ms, 74.6MB)
테스트 18 〉	통과 (0.02ms, 75.6MB)
테스트 19 〉	통과 (0.05ms, 81.6MB)
테스트 20 〉	통과 (0.04ms, 73.8MB)
테스트 21 〉	통과 (0.03ms, 76.9MB)
테스트 22 〉	통과 (0.03ms, 73.3MB)
테스트 23 〉	통과 (0.02ms, 75.8MB)
테스트 24 〉	통과 (0.02ms, 72.8MB)
 */
