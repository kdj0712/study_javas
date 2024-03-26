package quests;
import java.util.Scanner;

public class ForsIfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        scanner.close();
        int number = scanner.nextInt();
        for (int count = 1 ; count <= number ; count = count +1 ){
            int result =(int)Math.pow(2,count);
            if (result % 8 == 0){// Good morning : 6 ~ 11
                System.out.println(result);
            } else{            
            }
        }
    }
}