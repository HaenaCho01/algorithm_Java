package Programmers.lv0.codingTestBasicsTraining.day9_문자열;

public class Sol2_부분_문자열_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0,4},{1,2},{3,5},{7,7}}));
    }
}

class Solution2 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }
        return sb.toString();
    }
}

/*
테스트 1 〉	통과 (0.05ms, 71.8MB)
테스트 2 〉	통과 (0.04ms, 72MB)
테스트 3 〉	통과 (0.07ms, 87.3MB)
테스트 4 〉	통과 (0.04ms, 75.2MB)
테스트 5 〉	통과 (0.07ms, 72.1MB)
테스트 6 〉	통과 (0.04ms, 76.1MB)
테스트 7 〉	통과 (0.04ms, 76.8MB)
테스트 8 〉	통과 (0.08ms, 78.4MB)
테스트 9 〉	통과 (0.05ms, 74MB)
테스트 10 〉	통과 (0.06ms, 88.4MB)
테스트 11 〉	통과 (0.03ms, 71.3MB)
테스트 12 〉	통과 (0.03ms, 75.5MB)
테스트 13 〉	통과 (0.06ms, 77.6MB)
테스트 14 〉	통과 (0.04ms, 70.5MB)
테스트 15 〉	통과 (0.03ms, 77.1MB)
테스트 16 〉	통과 (0.05ms, 78MB)
테스트 17 〉	통과 (0.04ms, 78.6MB)
테스트 18 〉	통과 (0.04ms, 86.3MB)
테스트 19 〉	통과 (0.06ms, 78.3MB)
테스트 20 〉	통과 (0.05ms, 77.6MB)
 */