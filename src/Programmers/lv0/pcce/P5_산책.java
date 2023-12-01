package Programmers.lv0.pcce;

// 빈칸 채우기 문제

public class P5_산책 {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':

                    north-- // 빈칸
                    ;
                    break;
                case 'E':

                    east++ // 빈칸
                    ;
                    break;
                case 'W':

                    east-- // 빈칸
                    ;

                    break // 빈칸
                            ;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 78.3MB)
테스트 2 〉	통과 (0.02ms, 73.9MB)
테스트 3 〉	통과 (0.03ms, 73.2MB)
테스트 4 〉	통과 (0.02ms, 75MB)
테스트 5 〉	통과 (0.02ms, 75.7MB)
테스트 6 〉	통과 (0.03ms, 70.9MB)
테스트 7 〉	통과 (0.03ms, 76.3MB)
테스트 8 〉	통과 (0.01ms, 72.1MB)
테스트 9 〉	통과 (0.02ms, 78.9MB)
테스트 10 〉	통과 (0.02ms, 77.7MB)
테스트 11 〉	통과 (0.03ms, 72MB)
테스트 12 〉	통과 (0.02ms, 64.7MB)
테스트 13 〉	통과 (0.01ms, 76.8MB)
테스트 14 〉	통과 (0.01ms, 79.9MB)
테스트 15 〉	통과 (0.02ms, 74.1MB)
테스트 16 〉	통과 (0.02ms, 73MB)
테스트 17 〉	통과 (0.01ms, 75.6MB)
테스트 18 〉	통과 (0.01ms, 73.8MB)
테스트 19 〉	통과 (0.02ms, 77MB)
테스트 20 〉	통과 (0.02ms, 72.6MB)
테스트 21 〉	통과 (0.01ms, 72.2MB)
테스트 22 〉	통과 (0.01ms, 76.8MB)
테스트 23 〉	통과 (0.01ms, 70.5MB)
테스트 24 〉	통과 (0.02ms, 74.8MB)
테스트 25 〉	통과 (0.01ms, 87.1MB)
테스트 26 〉	통과 (0.01ms, 71.9MB)
테스트 27 〉	통과 (0.02ms, 70.3MB)
테스트 28 〉	통과 (0.02ms, 74.6MB)
테스트 29 〉	통과 (0.03ms, 74.8MB)
테스트 30 〉	통과 (0.01ms, 76.6MB)
테스트 31 〉	통과 (0.01ms, 74.5MB)
테스트 32 〉	통과 (0.02ms, 71.8MB)
테스트 33 〉	통과 (0.01ms, 70.3MB)
테스트 34 〉	통과 (0.03ms, 66.3MB)
테스트 35 〉	통과 (0.02ms, 76.2MB)
테스트 36 〉	통과 (0.02ms, 72.3MB)
 */