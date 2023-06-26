package Programmers.lv0.codingTestBasicsTraining.day17_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    public String[] solution(String[] strArr) {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                strList.add(strArr[i]);
            }
        }
        String[] answer = new String[strList.size()];
        strList.toArray(answer);
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 76.8MB)
테스트 2 〉	통과 (0.04ms, 83.4MB)
테스트 3 〉	통과 (1.39ms, 79MB)
테스트 4 〉	통과 (0.93ms, 77.7MB)
테스트 5 〉	통과 (0.24ms, 79.3MB)
테스트 6 〉	통과 (0.17ms, 72.4MB)
테스트 7 〉	통과 (0.43ms, 77.6MB)
테스트 8 〉	통과 (0.86ms, 75.5MB)
테스트 9 〉	통과 (0.72ms, 84.7MB)
테스트 10 〉	통과 (1.06ms, 87.8MB)
테스트 11 〉	통과 (0.89ms, 79.4MB)
테스트 12 〉	통과 (1.13ms, 82.6MB)
테스트 13 〉	통과 (1.03ms, 74.7MB)
 */

public class Sol3_ad_제거하기 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(Arrays.toString(sol.solution(new String[]{"and", "notad", "abcd"})));
        System.out.println(Arrays.toString(sol.solution(new String[]{"there","are","no","a","ds"})));
    }
}
