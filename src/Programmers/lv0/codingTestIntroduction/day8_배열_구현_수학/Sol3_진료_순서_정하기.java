package Programmers.lv0.codingTestIntroduction.day8_배열_구현_수학;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Sol3_진료_순서_정하기 {
    public int[] solution(int[] emergency) {
        int[] answer = Arrays.copyOf(emergency, emergency.length);
        Integer[] sortArray = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(sortArray, Collections.reverseOrder());
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (sortArray[i] == emergency[j]) {
                    answer[j] = i + 1;
                }
            }
        }
        return answer;
    }

    public int[] solutionOther(int[] e) {
        return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }

    public static void main(String[] args) {
        Sol3_진료_순서_정하기 sol = new Sol3_진료_순서_정하기();
        System.out.println(Arrays.toString(sol.solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(sol.solution(new int[]{1,2,3,4,5,6,7})));
        System.out.println(Arrays.toString(sol.solutionOther(new int[]{30,10,23,6,100})));
    }
}

/*
테스트 1 〉	통과 (2.56ms, 76.5MB)
테스트 2 〉	통과 (2.19ms, 79.8MB)
테스트 3 〉	통과 (2.17ms, 78.2MB)
테스트 4 〉	통과 (2.19ms, 73.5MB)
테스트 5 〉	통과 (2.33ms, 78MB)
테스트 6 〉	통과 (2.03ms, 73.1MB)
테스트 7 〉	통과 (3.54ms, 83.2MB)
테스트 8 〉	통과 (2.66ms, 71.3MB)
 */
