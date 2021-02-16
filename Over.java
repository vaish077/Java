public class Over{
    public static int add(int a , int b){
        return a + b;
    }
    public static double add(double a , double b){
        return a + b;
    }
    public static float multiply(float a , float b){
        return a * b;
    }
    public static int multiply(int a , int b){
        return a * b;
    }
    public static String concat(String str1 , String str2){
        return str1 + str2;
    }
    public static String concat(String str1 , String str2 , String str3){
        return str1 + str2 + str3;
    }
    public static void main(String[] args){
        System.out.println(add ( 50 , 30) );
        System.out.println(add ( 20.20 , 35.90));
        System.out.println(multiply ( 20.20f , 35.90f));
        System.out.println(multiply ( 60 , 2));
        System.out.println(concat("Naman" , "Kaushik"));
        System.out.println(concat("Naman" , "Kaushik" , "Manav Rachna"));
    }

    }
