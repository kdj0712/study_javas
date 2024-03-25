package quests;
import java.util.ArrayList;
import java.util.Scanner;

public class PollsWithoutDB {
    public static void main(String[] args) {
        ArrayList<String> listFilm = new ArrayList<String>();
        // Array에 값 입력
        listFilm.add("인터스텔라");
        listFilm.add("해리포터");
        listFilm.add("반지의제왕");

        ArrayList<String> listQuestion = new ArrayList<String>();
        // Array에 값 입력
        listQuestion.add("1)좋음");
        listQuestion.add("2)중간");
        listQuestion.add("3)나쁨");

        ArrayList<String> listAnswer = new ArrayList<String>();
        for (int i=0; i<listFilm.size(); i++){
            System.out.println(listFilm.get(i));
            System.out.println(listQuestion);
            Scanner Scanner = new Scanner(System.in);
            System.out.print("당신의 점수를 입력하세요 : ");
            listAnswer.add(Scanner.nextLine());
        }            
        System.out.print("당신의 평가는" + listAnswer +"입니다.");
    }
}