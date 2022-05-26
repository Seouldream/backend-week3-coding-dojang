import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //0.준비 및 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int input = scanner.nextInt();
        //소수 1과 자기자신을 제외한 어떤수로 나누어도 나머지가 0이 아님
        // 1 예외처리
        if (input ==1) {
            System.out.println("소수 아님");
        }

        //for 문으로 2부터 input-1까지 나눈 결과값 나오게하기
        for (int i = 2; i < input; i += 1) {
            //나눈 결과값이 한번이라도 0 이면 -> 소수가 아님->소수아님이라고 말하고 빠져나와,전부 0이 아니면 소수 라고 말해
            if (input % i == 0 ) {
                System.out.println("소수 아님");
                break; //나눠지면 ->소수
            } //어떤수라도 나눠지면 바로 소수아님으로 판별함
            if (input % i != 0) {
                System.out.println("소수");
                break;


            }
        }
    }
}
