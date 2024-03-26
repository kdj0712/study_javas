package quests;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class problemsWithoutDB {
    public static void main(String[] args) {
        ArrayList<HashMap> listQuestion = new ArrayList<HashMap>();

        HashMap<String, String> Q1 = new HashMap<String, String>();
        HashMap<String, String> Q2 = new HashMap<String, String>();
        HashMap<String, String> Q3 = new HashMap<String, String>();
        HashMap<String, String> Q4 = new HashMap<String, String>();

        // 값 넣기
        Q1.put("1. 문제: Python에서 변수를 선언하는 방법은? (점수: 10점)", "1) var name, 2) name = value, 3) set name, 4) name == value");
        Q2.put("2. 문제: Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)", " 1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        Q3.put("3. 문제: Python에서 조건문을 작성하는 방법은? (점수: 10점)", "1) if-else, 2) for-in, 3) while, 4) def");
        Q4.put("4. 문제: Python에서 함수를 정의하는 방법은? (점수: 5점)", "1) class, 2) def, 3) import, 4) return");

        listQuestion.add(Q1);
        listQuestion.add(Q2);
        listQuestion.add(Q3);
        listQuestion.add(Q4);

        ArrayList<String> listAnswer = new ArrayList<String>();

        for (int i=0; i<listQuestion.size(); i++){
            HashMap<String,String> ques = listQuestion.get(i);
            for (String key  : ques.keySet()){
                System.out.println(key);
                System.out.println(ques.get(key));
            }
            System.out.print("답을 입력하세요 : ");
            Scanner scanner = new Scanner(System.in);
            listAnswer.add(scanner.nextLine());
        }            
        System.out.print("당신이 입력하신 답은" + listAnswer +"입니다.");
    }
}