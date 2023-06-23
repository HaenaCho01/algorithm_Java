package Programmers.lv0.codingTestBasicsTraining.day9_문자열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol4_접미사_배열 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        for (String s1 : sol.solution("banana")) {
            System.out.print(s1 + " ");
        }
        System.out.println();
        for (String s2 : sol.solution("programmers")) {
            System.out.print(s2 + " ");
        }
    }
}

class Solution4 {
    public String[] solution(String my_string) {
        List<String> stringList = new ArrayList<>();

        for (int i = my_string.length() - 1; i >= 0; i--) {
            String str = my_string.substring(i);
            stringList.add(str);
        }

        Collections.sort(stringList);

        String[] answer = new String[stringList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = stringList.get(i);
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.31ms, 77.8MB)
테스트 2 〉	통과 (0.22ms, 74.3MB)
테스트 3 〉	통과 (0.21ms, 77.8MB)
테스트 4 〉	통과 (0.27ms, 67.1MB)
테스트 5 〉	통과 (0.30ms, 86.5MB)
테스트 6 〉	통과 (0.34ms, 80.5MB)
테스트 7 〉	통과 (0.27ms, 74.1MB)
테스트 8 〉	통과 (0.36ms, 74.4MB)
테스트 9 〉	통과 (0.31ms, 72.3MB)
테스트 10 〉	통과 (0.71ms, 71.9MB)
테스트 11 〉	통과 (0.63ms, 79.7MB)
테스트 12 〉	통과 (0.58ms, 74.8MB)
테스트 13 〉	통과 (0.51ms, 79.5MB)
테스트 14 〉	통과 (1.07ms, 79MB)
테스트 15 〉	통과 (0.88ms, 75.1MB)
테스트 16 〉	통과 (0.49ms, 74.7MB)
테스트 17 〉	통과 (0.62ms, 65MB)
테스트 18 〉	통과 (0.38ms, 72.5MB)
테스트 19 〉	통과 (0.17ms, 76.4MB)
 */
