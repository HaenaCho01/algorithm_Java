package Programmers.lv0.codingTestBasicsTraining.day16_문자열;

import java.util.Arrays;

class Solution3 {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 1) {
                strArr[i] = strArr[i].toUpperCase();
            } else {
                strArr[i] = strArr[i].toLowerCase();
            }
        }
        return strArr;
    }
}

/*
테스트 1 〉	통과 (0.07ms, 80.4MB)
테스트 2 〉	통과 (0.06ms, 73.8MB)
테스트 3 〉	통과 (0.05ms, 87.7MB)
테스트 4 〉	통과 (0.03ms, 71.7MB)
테스트 5 〉	통과 (0.04ms, 85.9MB)
테스트 6 〉	통과 (0.05ms, 67.6MB)
테스트 7 〉	통과 (0.04ms, 73MB)
테스트 8 〉	통과 (0.06ms, 65.2MB)
테스트 9 〉	통과 (0.05ms, 70.5MB)
테스트 10 〉	통과 (0.06ms, 69.3MB)
테스트 11 〉	통과 (0.07ms, 74MB)
 */

public class Sol3_배열에서_문자열_대소문자_변환하기 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(Arrays.toString(sol.solution(new String[]{"AAA", "BBB", "CCC", "DDD"})));
        System.out.println(Arrays.toString(sol.solution(new String[]{"aBc","AbC"})));
    }
}
