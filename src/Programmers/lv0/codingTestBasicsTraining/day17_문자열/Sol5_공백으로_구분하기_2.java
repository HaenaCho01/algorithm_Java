package Programmers.lv0.codingTestBasicsTraining.day17_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution5 {
    public String[] solution(String my_string) {
        String[] strArr = my_string.split(" ");
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < strArr.length;i++) {
            if (!strArr[i].equals("")) {
                strList.add(strArr[i]);
            }
        }
        return strList.toArray(new String[strList.size()]);
    }
}

/*
테스트 1 〉	통과 (0.36ms, 72.4MB)
테스트 2 〉	통과 (0.14ms, 78.4MB)
테스트 3 〉	통과 (0.59ms, 72.3MB)
테스트 4 〉	통과 (0.21ms, 81.9MB)
테스트 5 〉	통과 (0.17ms, 78.4MB)
테스트 6 〉	통과 (0.28ms, 83.1MB)
테스트 7 〉	통과 (0.30ms, 95.6MB)
테스트 8 〉	통과 (0.20ms, 73.5MB)
테스트 9 〉	통과 (0.58ms, 71.1MB)
테스트 10 〉	통과 (0.04ms, 76MB)
 */

public class Sol5_공백으로_구분하기_2 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(Arrays.toString(sol.solution(" i    love  you")));
        System.out.println(Arrays.toString(sol.solution("    programmers  ")));
    }
}
