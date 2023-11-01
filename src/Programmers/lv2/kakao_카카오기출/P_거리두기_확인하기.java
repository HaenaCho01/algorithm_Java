package Programmers.lv2.kakao_카카오기출;

public class P_거리두기_확인하기 {
    class Solution {
        // 방향 배열 선언 - 상좌우하
        private static final int dx[] = {0, -1, 1, 0};
        private static final int dy[] = {-1, 0, 0, 1};

        // 대기실 별로 나눠서 거리두기 확인하여 정답 배열 반환
        public int[] solution(String[][] places) {
            int[] answer = new int[places.length];
            for (int i = 0; i < answer.length; i++) {
                String[] place = places[i];
                char[][] room = new char[place.length][];
                for (int j = 0; j < room.length; j++) {
                    room[j] = place[j].toCharArray();
                }
                if (isDistanced(room)) {
                    answer[i] = 1;
                } else {
                    answer[i] = 0;
                }
            }
            return answer;
        }

        // 한 위치의 맨해튼 거리 2 확인 -> 지켜지지 않으면 true 반환
        private boolean isNextToVolunteer (char[][] room, int x, int y, int exclude) {
            for (int d = 0; d < 4; d++) {
                if (d == exclude) continue;

                int nx = x + dx[d];
                int ny = y + dy[d];
                if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length)
                    continue;
                if (room[ny][nx] == 'P') return true;
            }
            return false;
        }

        // 한 위치의 맨해튼 거리 확인 -> 지켜지면 true 반환
        private boolean isDistanced(char[][] room, int x, int y) {
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (ny < 0 || ny >= room.length || nx < 0|| nx >= room[ny].length)
                    continue;
                switch (room[ny][nx]) {
                    // 맨해튼 거리 1 확인
                    case 'P': return false;
                    // 맨해튼 거리 2 확인
                    case 'O':
                        if (isNextToVolunteer(room, nx, ny, 3-d)) return false;
                        break;
                }
            }
            return true;
        }

        // 대기실 전체 거리두기 확인 -> 지켜지면 true 반환
        private boolean isDistanced(char[][] room) {
            for (int y = 0; y < room.length; y++) {
                for (int x = 0; x < room[y].length; x++) {
                    if (room[y][x] != 'P') continue;
                    if (!isDistanced(room, x, y)) return false;
                }
            }
            return true;
        }
    }
}

/*
테스트 1 〉	통과 (0.05ms, 72.1MB)
테스트 2 〉	통과 (0.07ms, 67.6MB)
테스트 3 〉	통과 (0.04ms, 75.7MB)
테스트 4 〉	통과 (0.06ms, 77.5MB)
테스트 5 〉	통과 (0.07ms, 73.3MB)
테스트 6 〉	통과 (0.07ms, 67.9MB)
테스트 7 〉	통과 (0.06ms, 74.1MB)
테스트 8 〉	통과 (0.05ms, 75.4MB)
테스트 9 〉	통과 (0.06ms, 73.3MB)
테스트 10 〉	통과 (0.04ms, 72.7MB)
테스트 11 〉	통과 (0.07ms, 73.8MB)
테스트 12 〉	통과 (0.05ms, 70.8MB)
테스트 13 〉	통과 (0.06ms, 84.2MB)
테스트 14 〉	통과 (0.05ms, 74.9MB)
테스트 15 〉	통과 (0.06ms, 78.1MB)
테스트 16 〉	통과 (0.04ms, 77.4MB)
테스트 17 〉	통과 (0.07ms, 73.3MB)
테스트 18 〉	통과 (0.06ms, 78.6MB)
테스트 19 〉	통과 (0.05ms, 76.7MB)
테스트 20 〉	통과 (0.07ms, 71.1MB)
테스트 21 〉	통과 (0.07ms, 73.1MB)
테스트 22 〉	통과 (0.04ms, 73.4MB)
테스트 23 〉	통과 (0.12ms, 78.3MB)
테스트 24 〉	통과 (0.06ms, 83MB)
테스트 25 〉	통과 (0.05ms, 81.2MB)
테스트 26 〉	통과 (0.05ms, 83.5MB)
테스트 27 〉	통과 (0.06ms, 76.6MB)
테스트 28 〉	통과 (0.06ms, 74.2MB)
테스트 29 〉	통과 (0.06ms, 70.7MB)
테스트 30 〉	통과 (0.04ms, 72.4MB)
테스트 31 〉	통과 (0.06ms, 75.8MB)
 */
