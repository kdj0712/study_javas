package quests;
import java.util.Scanner;

public class WhilesIfs {
    public static void main(String[] args) {
        boolean whileFlag = true;
        while (whileFlag) {
            Scanner Scanner = new Scanner(System.in);
            System.out.print("숫자를 입력하세요 : ");
            int number = Scanner.nextInt();
            if (90<=number && number<=100){// Good morning : 6 ~ 11
                System.out.println("당신의 학점은 A입니다");
            } else if (80<=number && number<=89){// Good morning : 6 ~ 11
                System.out.println("당신의 학점은 B입니다");
            } else if (70<=number && number<=79){// Good morning : 6 ~ 11
                System.out.println("당신의 학점은 C입니다");
            } else if (0<number && number<=69){// Good morning : 6 ~ 11
                System.out.println("당신의 학점은 F입니다");
            } else if (number == -1){// Good morning : 6 ~ 11
                break;
            }
        }
    }
}