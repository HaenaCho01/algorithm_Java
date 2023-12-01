package Programmers.lv0.pcce;

// 빈칸 채우기 문제

public class P7_가습기 {
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return
                    3 // 빈칸
                    ;
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;

        else // 빈칸
            return 5 // 빈칸
                    ;
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return
                0 // 빈칸
                ;
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity) // 빈칸
            ;
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set) // 빈칸
            ;
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set) // 빈칸
            ;
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 73.5MB)
테스트 2 〉	통과 (0.02ms, 74.7MB)
테스트 3 〉	통과 (0.03ms, 68.2MB)
테스트 4 〉	통과 (0.03ms, 72.9MB)
테스트 5 〉	통과 (0.03ms, 79MB)
테스트 6 〉	통과 (0.02ms, 74.9MB)
테스트 7 〉	통과 (0.02ms, 71.3MB)
테스트 8 〉	통과 (0.03ms, 77MB)
테스트 9 〉	통과 (0.03ms, 77MB)
테스트 10 〉	통과 (0.02ms, 72MB)
테스트 11 〉	통과 (0.01ms, 77.4MB)
테스트 12 〉	통과 (0.02ms, 75.9MB)
테스트 13 〉	통과 (0.03ms, 71.6MB)
테스트 14 〉	통과 (0.04ms, 72.1MB)
테스트 15 〉	통과 (0.02ms, 75.3MB)
테스트 16 〉	통과 (0.02ms, 71.9MB)
테스트 17 〉	통과 (0.02ms, 77.8MB)
테스트 18 〉	통과 (0.02ms, 79.7MB)
테스트 19 〉	통과 (0.03ms, 78.3MB)
테스트 20 〉	통과 (0.02ms, 72.4MB)
테스트 21 〉	통과 (0.02ms, 73.5MB)
테스트 22 〉	통과 (0.04ms, 74.2MB)
테스트 23 〉	통과 (0.03ms, 74.9MB)
테스트 24 〉	통과 (0.02ms, 75.2MB)
테스트 25 〉	통과 (0.02ms, 72.4MB)
테스트 26 〉	통과 (0.02ms, 75.6MB)
테스트 27 〉	통과 (0.03ms, 77.5MB)
테스트 28 〉	통과 (0.02ms, 75.7MB)
테스트 29 〉	통과 (0.02ms, 70.8MB)
테스트 30 〉	통과 (0.02ms, 79.5MB)
테스트 31 〉	통과 (0.02ms, 71MB)
테스트 32 〉	통과 (0.02ms, 79.6MB)
테스트 33 〉	통과 (0.02ms, 76.2MB)
테스트 34 〉	통과 (0.03ms, 77.1MB)
테스트 35 〉	통과 (0.02ms, 73.6MB)
테스트 36 〉	통과 (0.02ms, 78.4MB)
테스트 37 〉	통과 (0.02ms, 78.3MB)
테스트 38 〉	통과 (0.03ms, 73.5MB)
테스트 39 〉	통과 (0.02ms, 78.3MB)
테스트 40 〉	통과 (0.03ms, 78.9MB)
테스트 41 〉	통과 (0.03ms, 71.9MB)
테스트 42 〉	통과 (0.02ms, 75.9MB)
테스트 43 〉	통과 (0.03ms, 77.2MB)
테스트 44 〉	통과 (0.02ms, 72.6MB)
테스트 45 〉	통과 (0.02ms, 76.9MB)
테스트 46 〉	통과 (0.03ms, 73.2MB)
테스트 47 〉	통과 (0.03ms, 77.5MB)
테스트 48 〉	통과 (0.03ms, 74.6MB)
테스트 49 〉	통과 (0.02ms, 77.8MB)
테스트 50 〉	통과 (0.02ms, 76.1MB)
테스트 51 〉	통과 (0.03ms, 73.9MB)
테스트 52 〉	통과 (0.03ms, 73.4MB)
테스트 53 〉	통과 (0.02ms, 72MB)
테스트 54 〉	통과 (0.03ms, 75.8MB)
테스트 55 〉	통과 (0.03ms, 80.1MB)
테스트 56 〉	통과 (0.03ms, 76.4MB)
테스트 57 〉	통과 (0.02ms, 73.4MB)
테스트 58 〉	통과 (0.02ms, 73.1MB)
테스트 59 〉	통과 (0.03ms, 68.4MB)
테스트 60 〉	통과 (0.02ms, 72.1MB)
 */