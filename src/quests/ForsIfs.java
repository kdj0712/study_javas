package quests;
import java.util.Scanner;

public class ForsIfs {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int number = Scanner.nextInt();
        for (int count = 1 ; count <= number ; count++){
            int result =(int)Math.pow(2,count);
            if (result % 4 == 0){// Good morning : 6 ~ 11
                System.out.println(result);
            } else{            
            }
        }
    }
}