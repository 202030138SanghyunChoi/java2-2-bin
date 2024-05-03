package mid;
import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        
        Scanner scanTool = new Scanner(System.in);

        System.out.print("월(1~12)을 입력하시오.");

        int month = scanTool.nextInt();

        if(month == 12 || month < 3){
            System.out.println("겨울입니다.");
        }
        else if (month <= 5){
            System.out.println("봄입니다.");
        }
        else if (month <= 8) {
            System.out.println("여름입니다.");
        }
        else if (month <= 11){
            System.out.println("가을입니다.");
        }
        else{
            System.out.println("장난 치지 마세요.");
        }

        scanTool.close();
    }
}
