import java.util.Scanner;

public class DevideByZeroHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;

        System.out.println("제수를 입력하십시오.: ");
        dividend = scanner.nextInt();
        System.out.println("피제수를 입력하십시오.: ");
        divisor = scanner.nextInt();

        try {
            System.out.println(dividend + "를 " + divisor + "로 나눈 몫은 " + dividend/divisor + "입니다.");
        }
        catch (ArithmeticException e) {
            System.out.println("수학 공부를 더 하십시오.");
        }
        
        scanner.close();
    }
}