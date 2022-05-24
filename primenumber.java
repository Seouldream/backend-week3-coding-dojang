import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("n: ");
        int inputnumber = scanner.nextInt();

        for (int x = inputnumber - 1; x > 2; x -= 1) {
            boolean rest = inputnumber % x == 0;
            if (rest) {
                System.out.println("소수 아님");
                break;
            }
            if (!(rest)) {
                System.out.println("소수");
                break;
            }
        }
        //조건절에서 주어진 숫자가 소수 인지 아닌지 구분함
        //추가로 필요한 식 "소수아님이 한번이라도 있다면 소수가 아니다"
    }
}
