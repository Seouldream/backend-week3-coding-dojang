//0. 5진법 어떤 수를 5로 나누고 그 나머지를 거꾸로 올라가 읽음
// 첫 나머지 divided % divisor(5)  두번째 나머지 첫째 몫 % 5
// int quotient = divided/5  두번째부터 나머지는 quotient % 5 두번째 몫 = quotient/5
// int = quotient < 0
// 마지막 나머지 * 10^n + .... + 첫나머지

import java.util.Scanner;

public class Pentagram {
    public static void main(String[] args) {
        //0.스캐너 준비 및 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int divided = scanner.nextInt();

        //1.계산 식 구하기
        //구해야할 것  나눌때마다 몫과 나머지...몫이 1보다 작을때 까지
        //첫째 몫 과 나머지
        int quotient = divided / 5;
        int remainder = divided % 5;

        int result = 0;
        int power = 1;

        // ... 반복 언제까지?(몫이 1보다 작을때까지) -> 첫 시작(초기값 지정) 조건확인 상태 변경 (divided/5 ,quotient<1,
        while (quotient > 0) {
            quotient = quotient / 5;
            remainder = quotient % 5;
            result = remainder * power + result;
            power *= 10;
        }
        System.out.println("5 진수:" + result);
    }
}
