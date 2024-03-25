// refer : https://www.w3schools.com/java/java_for_loop.asp

import java.util.ArrayList;

public class LoopsFors {
    public static void main(String[] args) {
        ArrayList<String> listFirst = new ArrayList<String>();
        // Array에 값 입력
        listFirst.add("Volvo");
        listFirst.add("BMW");
        listFirst.add("Ford");

        /*
           for 동작 위한 조건 : 반복 횟수, 종료 조건, 시작점
           statement 1 : 시작점
           statement 2 : 종료 조건 
           statement 3 : 반복 횟수
         * for ( statement 1 ; statement 2 ; statement 3 ){
         * }
         */
        /*
        예제 : 1 ~ 5 까지 1씩 증가하면서 출력
         */
        // int count = 1;
        // boolean boolCount
        // for ( int count = 1 ; count <= 5 ; count = count + 1 ){
        for (int count = 1 ; count <= 5 ; count++){
            System.out.println("For count : " + count);
            }

        for (int i=0; i<listFirst.size(); i++){
            System.out.println("for count "+listFirst.get(i));
        }
        // for (type variableName : arrayName) {
        //     // code block to be executed
        //   }
        // String srtFirst = new String("Hello World !");
        for(String str:listFirst){
            System.out.println("for each" + str);
        }

        System.out.println("Hello World!");
        
       // return 0; 
    }
}