package Programmers.lv0.codingTestBasicsTraining.day10_문자열;

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public int solution(String my_string, String is_prefix) {
        List<String> prefixList = new ArrayList<>();

        for(int i = 1; i < my_string.length(); i++) {
            String prefix = my_string.substring(0, i);
            prefixList.add(prefix);
        }

        int answer = (prefixList.contains(is_prefix)) ? 1 : 0;
        return answer;
    }
}

public class Sol2_접두사인지_확인하기 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.solution("banana", "ban"));
        System.out.println(sol.solution("banana", "nan"));
        System.out.println(sol.solution("banana", "abcd"));
        System.out.println(sol.solution("banana", "bananan"));
    }
}

/*
테스트 1 〉	통과 (0.05ms, 71.1MB)
테스트 2 〉	통과 (0.05ms, 75.1MB)
테스트 3 〉	통과 (0.08ms, 71.9MB)
테스트 4 〉	통과 (0.04ms, 75.7MB)
테스트 5 〉	통과 (0.06ms, 87.2MB)
테스트 6 〉	통과 (0.06ms, 70.4MB)
테스트 7 〉	통과 (0.04ms, 71.7MB)
테스트 8 〉	통과 (0.05ms, 78.2MB)
테스트 9 〉	통과 (0.03ms, 77.9MB)
테스트 10 〉	통과 (0.05ms, 75.3MB)
테스트 11 〉	통과 (0.06ms, 71.8MB)
테스트 12 〉	통과 (0.04ms, 73.8MB)
테스트 13 〉	통과 (0.04ms, 77.7MB)
테스트 14 〉	통과 (0.09ms, 76.2MB)
테스트 15 〉	통과 (0.05ms, 72.4MB)
테스트 16 〉	통과 (0.04ms, 72.6MB)
테스트 17 〉	통과 (0.12ms, 80.6MB)
테스트 18 〉	통과 (0.05ms, 76.6MB)
테스트 19 〉	통과 (0.04ms, 77.7MB)
테스트 20 〉	통과 (0.07ms, 83.4MB)
테스트 21 〉	통과 (0.08ms, 76.3MB)
테스트 22 〉	통과 (0.05ms, 77.1MB)
테스트 23 〉	통과 (0.06ms, 77.2MB)
 */
