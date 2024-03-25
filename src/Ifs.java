public class Ifs {
    public static void main(String[] args) {
        // if (condition){
        // } else if (condition){
        // } else{
        // }

        /*  예제 : 시간에 따른 영어 인사
        Good morning : 6 ~ 11
        Good afternoon : 11 ~ 17
        Good evening: 17 ~ 24
        */
        int hour = 11;
        if (hour <= 11){// Good morning : 6 ~ 11
            System.out.println("Good morning!");
        } else if (hour <= 17){
            System.out.println("Good afternoon!");
        } else{
            System.out.println("Good evening!");
        }
        System.out.println("Hello World!");
       // return 0; 

        /*  예제 : 시간에 따른 영어 인사, and 조건 추가해 
        Good morning : 6 ~ 11
        Good afternoon : 11 ~ 17
        Good evening: 17 ~ 24
        */
        // error : Duplicate local variable hourJava(536870967), 해결 = DataType 정리
        // int hour = 11;
        hour = 1;
        if ((hour >= 6) && (hour <= 11)){// Good morning : 6 ~ 11
            System.out.println("Good morning!");
        } else if ((hour >= 12) && (hour <= 17)){
            System.out.println("Good afternoon!");
        } else if((hour >= 18) && (hour <= 24) ){ 
            System.out.println("Good evening!");
        } else{
            System.out.println("Don't know!");
        }
        System.out.println("Hello World!");
       // return 0; 
    }
}