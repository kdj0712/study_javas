package quests;
import java.util.Scanner;

public class ForsIfs {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int number = Scanner.nextInt();
        for (int count = 1 ; count <= number ; count++){
            if (count % 4 == 0){// Good morning : 6 ~ 11
                System.out.println(count);
            } else{            
            }
        }
    }
}