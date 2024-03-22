public class DataTypes {
    public static void main(String[] args){
        // Numbers 
        int intFirst = 3;
        System.out.println("Numbers int First : " + intFirst);
        // intFirst = 5.3
        // Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from double to int.
        // intFirst = "5.3"
        // Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from String to int.

        boolean boolFirst = true;
        System.out.println("Boolean bool First : " + boolFirst);

        String stringFirst = "Hello DataTypes!";
        System.out.println("String string First : " + stringFirst);

        float floatFirst = 2 / 3;
        System.out.println("float float First : " + floatFirst);

        return ;
    }    
}
