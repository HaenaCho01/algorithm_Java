package Programmers.lv0.codingTestBasicsTraining.day9_문자열;

import java.util.ArrayList;
import java.util.List;

public class Sol5_접미사인지_확인하기 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(sol.solution("banana", "ana"));
        System.out.println(sol.solution("banana", "nan"));
        System.out.println(sol.solution("banana", "wxyz"));
        System.out.println(sol.solution("banana", "abanana"));
    }
}

class Solution5 {
    public int solution(String my_string, String is_suffix) {
        List<String> suffixList = new ArrayList<>();

        for (int i = my_string.length() - 1; i >= 0; i--) {
            String suffix = my_string.substring(i);
            suffixList.add(suffix);
        }

        int answer = (suffixList.contains(is_suffix)) ? 1 : 0;
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.07ms, 74MB)
테스트 2 〉	통과 (0.06ms, 69.1MB)
테스트 3 〉	통과 (0.04ms, 72.6MB)
테스트 4 〉	통과 (0.10ms, 80MB)
테스트 5 〉	통과 (0.05ms, 75.8MB)
테스트 6 〉	통과 (0.03ms, 72.2MB)
테스트 7 〉	통과 (0.07ms, 74.5MB)
테스트 8 〉	통과 (0.09ms, 71.5MB)
테스트 9 〉	통과 (0.09ms, 79.5MB)
테스트 10 〉	통과 (0.09ms, 76.3MB)
테스트 11 〉	통과 (0.06ms, 80.3MB)
테스트 12 〉	통과 (0.06ms, 74.5MB)
테스트 13 〉	통과 (0.04ms, 77.9MB)
테스트 14 〉	통과 (0.05ms, 78.7MB)
테스트 15 〉	통과 (0.07ms, 77.8MB)
테스트 16 〉	통과 (0.04ms, 81.6MB)
테스트 17 〉	통과 (0.04ms, 77MB)
테스트 18 〉	통과 (0.06ms, 77.2MB)
테스트 19 〉	통과 (0.07ms, 73.3MB)
 */
