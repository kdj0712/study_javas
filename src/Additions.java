// 외부 입력
import java.util.Scanner;

public class Additions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt();
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();
        int intAnswer = intFirst + intSecond; 
        System.out.print("Answer is : " + intAnswer );

        scanner.close();
    }
}