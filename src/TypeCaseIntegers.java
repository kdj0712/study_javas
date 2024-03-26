import java.util.Scanner;
public class TypeCaseIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 값 ㄷ받기
        String strFirst = scanner.nextLine();
        String strSecond = scanner.nextLine();

        int intFirst = Integer.parseInt(strFirst);
        int intSecond = Integer.parseInt(strSecond);

        // strFirst + strSecond
        // "12"
        // intFirst + intSecond
        // 3

        System.out.println("Hello World!");
        scanner.close();
       // return 0; 
    }
}