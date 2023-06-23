package Programmers.lv0.codingTestBasicsTraining.day10_문자열;

import java.util.ArrayList;
import java.util.List;

class Solution4 {
    public String solution(String my_string, int m, int c) {
        List<String> strList = new ArrayList<>();

        for (int i = 0; i < my_string.length();) {
            String str = my_string.substring(i, i + m);
            strList.add(str);
            i = i + m;
        }

        StringBuilder answer = new StringBuilder();
        for (String s : strList) {
            answer.append(s.charAt(c - 1));
        }

        return answer.toString();
    }
}

public class Sol4_세로_읽기 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.solution("ihrhbakrfpndopljhygc",4, 2));
        System.out.println(sol.solution("programmers",1, 1));
    }
}

/*

테스트 1 〉	통과 (0.06ms, 78.6MB)
테스트 2 〉	통과 (0.09ms, 73.4MB)
테스트 3 〉	통과 (0.04ms, 71.2MB)
테스트 4 〉	통과 (0.08ms, 72.3MB)
테스트 5 〉	통과 (0.04ms, 74.2MB)
테스트 6 〉	통과 (0.04ms, 77.3MB)
테스트 7 〉	통과 (0.36ms, 87.4MB)
테스트 8 〉	통과 (0.06ms, 77.1MB)
테스트 9 〉	통과 (0.06ms, 76.1MB)
테스트 10 〉	통과 (0.04ms, 82.6MB)
테스트 11 〉	통과 (0.05ms, 73.7MB)
테스트 12 〉	통과 (0.05ms, 77.7MB)
테스트 13 〉	통과 (0.80ms, 69.8MB)
테스트 14 〉	통과 (0.08ms, 76.8MB)
테스트 15 〉	통과 (0.12ms, 74.7MB)
테스트 16 〉	통과 (0.89ms, 75.5MB)
테스트 17 〉	통과 (0.03ms, 75.2MB)
테스트 18 〉	통과 (0.04ms, 84.1MB)
 */
