//값을 입력받는다.
//입력받은 값을 십육진수로 바꾸는 계산식을 구한다.
//주어진 값이 더이상 나눌수없을때 즉 몫이 16보다 작을때까지 나눈다. 그리고 나온 몫 부터 순차적으로 읽어감
//값 구하는 식부터 시작
//구한 값을 차례로 가져오기
import java.util.Scanner;
public class SixteenJinsuMaker {
    public static void main(String[] args) {
        // 준비
        Scanner scanner = new Scanner(System.in);
        System.out.print("십진수를 입력해주세요 : ");

        //몫 나머지 변수 부여

        int input_Number = scanner.nextInt();

        int quotient = input_Number/16;
        int remainder = input_Number%16;



        //몫이 1보다 작을때까지 나누는 반복문 생성

        for(int i =0;quotient>=16;i +=1) {
            //순차적으로 몫 나머지 구하기
            quotient = quotient/16;
            System.out.println("몫: " + quotient);
        }
        quotient = input_Number/16;
        for(int i =0;quotient>=16;i +=1) {
            //순차적으로 몫 나머지 구하기
            remainder = quotient%16;
            quotient = quotient/16;
            System.out.println("나머지: " + remainder);
        }
        //
    }
}
