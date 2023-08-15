package Programmers.lv1.collection_자료구조.Hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class P_폰켓몬 {
    public int solution(int[] nums) {
        // <폰켓몬의 종류 - 개수>를 담을 HashMap을 선언한다.
        HashMap<Integer, Integer> map = new HashMap<>();

        // 주어진 nums 배열을 돌며 <폰켓몬의 종류 - 개수>를 HashMap에 넣는다.
        for (int i = 0; i < nums.length; i++) {
            Integer key = nums[i];
            // 이전 값이 없는 경우 NullPointerException 방지를 위해 getOrDefault 사용해 이전 값을 불러온다.
            Integer value = map.getOrDefault(key, 0);
            // 이전 값의 +1씩하여 폰켓몬 종류별 개수를 센다.
            map.put(key, value++);
        }

        // 폰켓몬의 종류 개수와 최대 가져갈 수 있는 개수를 비교해 더 작은 값을 return 한다.
        return Math.min(map.size(), nums.length / 2);
    }

/* 테스트 통과 시간 : 0.04ms ~ 4.70ms
테스트 1 〉	통과 (0.05ms, 76.2MB)
테스트 2 〉	통과 (0.06ms, 72.3MB)
테스트 3 〉	통과 (0.04ms, 66.4MB)
테스트 4 〉	통과 (0.06ms, 66.9MB)
테스트 5 〉	통과 (0.06ms, 72.8MB)
테스트 6 〉	통과 (0.07ms, 76.3MB)
테스트 7 〉	통과 (0.23ms, 78.4MB)
테스트 8 〉	통과 (0.17ms, 75.9MB)
테스트 9 〉	통과 (0.29ms, 82.7MB)
테스트 10 〉	통과 (0.28ms, 78.8MB)
테스트 11 〉	통과 (0.39ms, 78.9MB)
테스트 12 〉	통과 (0.87ms, 73.5MB)
테스트 13 〉	통과 (1.16ms, 79.6MB)
테스트 14 〉	통과 (0.58ms, 71.4MB)
테스트 15 〉	통과 (1.22ms, 75MB)
테스트 16 〉	통과 (4.13ms, 87.1MB)
테스트 17 〉	통과 (3.49ms, 82.4MB)
테스트 18 〉	통과 (4.70ms, 79.2MB)
테스트 19 〉	통과 (4.24ms, 79.2MB)
테스트 20 〉	통과 (2.71ms, 76MB)
 */

    public int solution2(int[] nums) {
        // <폰켓몬의 종류>를 담을 HashSet을 선언한다.
        HashSet<Integer> set = new HashSet<>();

        // 주어진 nums 배열을 돌며 <폰켓몬의 종류>를 HashSet에 넣는다.
        // 단, 최대 가져갈 수 있는 개수에 도달할 경우 for문을 탈출한다.
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size() == nums.length / 2) {
                break;
            }
        }

        // set의 크기를 return 한다.
        return set.size();
    }

/* 테스트 통과 시간 : 0.04ms ~ 3.25ms
테스트 1 〉	통과 (0.05ms, 72MB)
테스트 2 〉	통과 (0.07ms, 74.1MB)
테스트 3 〉	통과 (0.04ms, 78.3MB)
테스트 4 〉	통과 (0.09ms, 77.8MB)
테스트 5 〉	통과 (0.05ms, 76.5MB)
테스트 6 〉	통과 (0.12ms, 79.8MB)
테스트 7 〉	통과 (0.24ms, 68.4MB)
테스트 8 〉	통과 (0.30ms, 75.3MB)
테스트 9 〉	통과 (0.36ms, 71.4MB)
테스트 10 〉	통과 (0.37ms, 74.4MB)
테스트 11 〉	통과 (0.28ms, 79MB)
테스트 12 〉	통과 (0.36ms, 80.2MB)
테스트 13 〉	통과 (0.62ms, 72.9MB)
테스트 14 〉	통과 (0.96ms, 77.3MB)
테스트 15 〉	통과 (0.73ms, 94.3MB)
테스트 16 〉	통과 (3.06ms, 79.9MB)
테스트 17 〉	통과 (2.81ms, 75.3MB)
테스트 18 〉	통과 (3.25ms, 83.8MB)
테스트 19 〉	통과 (2.71ms, 81.4MB)
테스트 20 〉	통과 (2.42ms, 81.3MB)
 */

    public int solution3(int[] nums) {
        // stream -> distinct를 사용해 중복값을 제거한 후 개수를 센다.
        // 중복값 제거한 개수와 최대값 중 작은 수를 return 한다.
        return (int) Math.min(Arrays.stream(nums).distinct().count(),nums.length / 2);
    }

/* 테스트 통과 시간 : 2.16ms ~ 10.83ms
테스트 1 〉	통과 (2.34ms, 74.5MB)
테스트 2 〉	통과 (7.10ms, 70.4MB)
테스트 3 〉	통과 (2.23ms, 79MB)
테스트 4 〉	통과 (3.10ms, 76.5MB)
테스트 5 〉	통과 (2.17ms, 82.2MB)
테스트 6 〉	통과 (1.97ms, 76.6MB)
테스트 7 〉	통과 (1.87ms, 79.4MB)
테스트 8 〉	통과 (2.35ms, 87.4MB)
테스트 9 〉	통과 (3.66ms, 73.8MB)
테스트 10 〉	통과 (2.38ms, 69MB)
테스트 11 〉	통과 (1.70ms, 76.5MB)
테스트 12 〉	통과 (2.16ms, 72.7MB)
테스트 13 〉	통과 (3.20ms, 77.9MB)
테스트 14 〉	통과 (2.30ms, 80.1MB)
테스트 15 〉	통과 (2.20ms, 78.4MB)
테스트 16 〉	통과 (6.77ms, 86MB)
테스트 17 〉	통과 (9.94ms, 78.5MB)
테스트 18 〉	통과 (7.98ms, 86.2MB)
테스트 19 〉	통과 (10.83ms, 87MB)
테스트 20 〉	통과 (7.17ms, 78.6MB)
 */

    public static void main(String[] args) {
        P_폰켓몬 sol = new P_폰켓몬();
        System.out.println(sol.solution(new int[]{3, 1, 2, 3}));
        System.out.println(sol.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(sol.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }
}
