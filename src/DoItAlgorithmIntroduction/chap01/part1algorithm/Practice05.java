package DoItAlgorithmIntroduction.chap01.part1algorithm;
// 중앙값을 구하는 다음의 메소드가 Median 클래스의 med3 메서드에 비해 효율이 떨어지는 이유?
/*
  처음 if 문의 판단
　　  if ((b >= a && c<= a) || (b <= a && c >= a)
 에 주목합니다.
  여기서 b >= a 및 b <= a의 판단을 뒤집은 판단
  (실질적으로 동일한 판단)이, 계속하여  else 이후에서
　　 else if ((a > b && c < b) || (b <= a && c > b)
  로 수행됩니다. 즉, 처음 if가 성립하지 않는 경우,
  2번째 if에서도 (실질적으로 ) 같은 판단을 수행하므로,
  효율이 나빠집니다.
*/

public class Practice05 {
    static int med3(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }
}
